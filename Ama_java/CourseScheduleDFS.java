public class CourseScheduleDFS {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // initilize the graph
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int j = 0; j < prerequisites.length; j++) {
            graph[prerequisites[j][1]].add(prerequisites[j][0]);
        }
        // visited stores visited vertex, onStack stores vertex at recursive calling.
        boolean[] visited = new boolean[numCourses];
        boolean[] onStack = new boolean[numCourses];
        boolean[] hasCycle = new boolean[1]; 
        
        for (int k = 0; k < numCourses; k++) {
            if (!visited[k]) {
                dfs(k, graph, visited, onStack, hasCycle);
            }
        }
        
        return !hasCycle[0];
    }
    
    public static void dfs(int k, ArrayList<Integer>[] graph, boolean[] visited, boolean[] onStack, boolean[] hasCycle) {
        onStack[k] = true;
        visited[k] = true;
        for (int v : graph[k]) {
            if (!visited[v]) {
                dfs(v, graph, visited, onStack, hasCycle);
            }
            else if (onStack[v]) {
                hasCycle[0] = true;
            }
        }
        onStack[k] = false;
    }
}