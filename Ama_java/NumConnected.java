public class NumConnected {
    public int countComponents(int n, int[][] edges) {
        int[] id = new int[n];
        for (int i=0; i<n; i++)
            id[i] = i;
        int count = n;
        for (int j=0; j<edges.length; j++) {
            int root1 = find(edges[j][0], id);
            int root2 = find(edges[j][1], id);
            if (root1 != root2){
                id[root2] = root1;
                count--;
            }
        }
        return count;
    }
    
    public static int find (int v, int[] id) {
        while (v != id[v])
            v = id[v];
        return v;
    }
}
//union find. each edges means a group of linked graph component.
//scan the edges array, to connect all part.
//use a counter to record number of component.