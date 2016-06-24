public class CouseSchedule {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];
        int count = 0;
		Node[] graph = new Node[numCourses];
		
		for (int k = 0; k < numCourses; k++) {
		    graph[k] = new Node(k);
		}
		
		for (int i = 0; i < prerequisites.length; i++) {
			graph[prerequisites[i][0]].prerequire.add(graph[prerequisites[i][1]]); 
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		for (Node n : graph) {
		    if (n.prerequire.size() == 0) {
		        queue.add(n);
		    }
		}
		
		while (!queue.isEmpty()) {
		    int size = queue.size();
		    for (int j = 0; j < size; j++) {
		        Node course = queue.poll();
		        result[count] = course.label;
		        count++;
		        
		        for (Node n : graph) {
		            if (n.prerequire.contains(course)) {
		                n.prerequire.remove(course);
		                if (n.prerequire.size() == 0) {
		                    queue.offer(n);
		                }
		            }
		        }
		    }
		}
		return count == numCourses ? result : new int[0];
    }
    
	class Node {
		int label;
		Set<Node> prerequire;

		public Node (int x) {
			label = x;
			prerequire = new HashSet<Node>();
		}
	}    
}