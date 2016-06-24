import java.util.*;

public class GraphProcess {
	public static List<Integer> findMinHeightTrees (int n, int[][] edges) {
		// initilize Graph according to edges
		Map<Integer, Node> graph = new HashMap<>();
		for (int i = 0; i < n; i++) {
			graph.put(i, new Node(i));
		}

		for (int j = 0; j< edges.length; j++) {
			graph.get(edges[j][0]).neighbors.add(graph.get(edges[j][1]));
			graph.get(edges[j][1]).neighbors.add(graph.get(edges[j][0]));
			graph.get(edges[j][0]).degree++;
			graph.get(edges[j][1]).degree++;
		}

		// find degree == 1 node<leaf>, remove, and repeatedly until last two
		Queue<Node> queue = new LinkedList<Node>();
		for (Integer index : graph.keySet()) {
			if (graph.get(index).degree == 1) {
				queue.offer(graph.get(index));
			}
		}

		while (n > 2) {
			int size = queue.size();
			for (int k = 0; k < size; k++) {
				Node vertex = queue.poll();
				for (Node neighborNode : vertex.neighbors) {
					neighborNode.neighbors.remove(vertex);
				}
				graph.remove(vertex.label);
				n--;
				for (Node neighborNode : vertex.neighbors) {
					if (--neighborNode.degree == 1) {
						queue.offer(neighborNode);
					}
				}				
			}
		}
		
		List<Integer> result = new ArrayList<>();
		for (Integer i : graph.keySet()) {
			result.add(i);
		}
		return result;

	}
	// user-definded Node class to preprocess edges
	class Node {
		int label;
		int degree;
		Set<Node> neighbors;

		public Node (int x) {
			label = x;
			neighbors = new HashSet<Node>();
		}
	}
}