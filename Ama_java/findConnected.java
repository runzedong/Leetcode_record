import java.util.*;

public class findConnected {
// method 1 dfs search
    public static int countComponents(int n, int[][] edges) {
        int count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++){
            if (!visited[i]) {
                dfs(i, edges, visited);
                count++;
            }
        }
        return count;
    }
    static void dfs(int v, int[][] edges, boolean[] visited) {
        visited[v] = true;
        for (int j=0; j<edges.length; j++) {
            if (v == edges[j][0] || v == edges[j][1]) {
                int temp = (v == edges[j][1]) ? edges[j][0] : edges[j][1];
                if (!visited[temp]) {
                    dfs(temp,edges,visited);
                }

            }
        }
    }

// method 2 union find
    public static int countComponents2 (int n, int[][] edges) {
    	int count = n;
    	int[] id = new int[n];
    	for (int i = 0; i < n; i++) {
    		id[i] = i;
    	}
    	for (int j = 0; j< edges.length; j++) {
    		int root1 = find(edges[j][0], id);
    		int root2 = find(edges[j][1], id);
    		if (root1 != root2){
    			id[root1] = root2;
    			count --;
    		}
    	}

    	return count;
    }
// find method to find the root of the current vertex
    public static int find (int vertex, int[] id) {
    	while (vertex != id[vertex])
    		vertex = id[vertex];
    	return vertex;
    }
 	public static void main(String[] args) {
    	int vertex = 5;
    	int [][] edges = {{1,0},{1,2},{4,3}};
    	System.out.println(countComponents2(vertex, edges));
    }
}