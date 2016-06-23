import java.util.*;

public class MinHeightTree {

    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new LinkedList<>();
        int[] heightList = new int[n];
        for (int i = 0; i < n; i++) {
            heightList[i] = getDepth(i, edges, n);
        }
        // test the heightList
        for (int each_height : heightList) {
        	System.out.println("the deep is "+each_height);
        }
        int minHeight = heightList[0];
        result.add(0);
        for (int k = 1; k < n; k++) {
            if (heightList[k] < minHeight) {
                minHeight = heightList[k];
                while (!result.isEmpty()) {
                    result.remove(result.size()-1);
                }
                result.add(k);
            }
            else if (heightList[k] == minHeight) {
                result.add(k);
            }
            else {
                continue;
            }
        }
        return result;
    }
    
    public static int getDepth(int node, int[][] edges, int n) {
        int deepth = 0;
        boolean[] Visited = new boolean[n];
        LinkedList<Integer> Queue = new LinkedList<>();
        Queue.add(node);
        Visited[node] = true;
        int nextLevelNum = 0;
        int currLevelNum = 1;
        while (!Queue.isEmpty()) {
            int temp = Queue.poll();
            currLevelNum -=1;
            for (int j = 0; j < edges.length; j++) {
                if (edges[j][0] == temp && !Visited[edges[j][1]]) {
                    Queue.add(edges[j][1]);
                    Visited[edges[j][1]] = true;
                    nextLevelNum += 1;
                }
                if (edges[j][1] == temp && !Visited[edges[j][0]]) {
                    Queue.add(edges[j][0]);
                    Visited[edges[j][0]] = true;
                    nextLevelNum += 1;
                }
            }
            if (currLevelNum == 0) {
                deepth++;
                currLevelNum = nextLevelNum;
                nextLevelNum = 0;
            }
        }
       return deepth;
    }

    public static void main(String[] args) {
    	int n = 6;
    	int[][] edges = {{0,1},{0,2},{0,3},{3,4},{4,5}};
    	findMinHeightTrees(n, edges);
    }
	
}