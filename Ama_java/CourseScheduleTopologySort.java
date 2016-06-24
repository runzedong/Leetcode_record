public class CourseScheduleTopologySort {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // build the graph
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        
        for (int j = 0; j < prerequisites.length; j++) {
            graph[prerequisites[j][1]].add(prerequisites[j][0]);
        }
        
        boolean[] visited = new boolean[numCourses];
        boolean[] onStack = new boolean[numCourses];
        boolean[] hasCycle = new boolean[1];
        int[] counter = new int[1];
        counter[0] = numCourses;
        int[] result = new int[numCourses];
        
        for (int k = 0; k < numCourses; k++) {
            if (!visited[k]) {
                dfs(k, graph, visited, onStack, result, hasCycle, counter);
            }
        }
        
        if (hasCycle[0]) {
            return new int[0];
        }
        
        return result;
    }
    
    public static void dfs(int v, ArrayList<Integer>[] graph, boolean[] visited, boolean[] onStack, int[] result, boolean[] hasCycle, int[] counter) {
        if (hasCycle[0]) {
            return;
        }
        onStack[v] = true;
        visited[v] = true;
        for (int w : graph[v]) {
            if (!visited[w]) {
                dfs(w, graph, visited, onStack, result, hasCycle, counter);
            }
            else if (onStack[w]) {
                hasCycle[0] = true;
            }
        }
        System.out.println("vertex is "+v);
        result[--counter[0]] = v;
        onStack[v] = false;
    }
}