public class GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        return isValidTree(n, edges);
    }
    
    public static boolean isValidTree(int n, int[][] edges) {
        int count = n;
        int[] id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        
        for (int j =0; j < edges.length; j++) {
            int root1 = findRoot(edges[j][0], id);
            int root2 = findRoot(edges[j][1], id);
            if (root1 != root2) {
                id[root1] = root2;
                count--;
            }
            else {
                return false;// this part, each edge union two subset. if they are belong to same subset<roo1=roo2>, there is a circle.
            }
        }
        return count == 1;
    }
    
    public static int findRoot(int node, int[] id) {
        while (node != id[node]) {
            node = id[node];
        }
        return node;
    }
}