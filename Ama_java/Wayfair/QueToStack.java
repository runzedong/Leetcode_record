public class QueToStack {
	private LinkedList<Integer> queue = new LinkedList<>();
// using one queue. push is O(n). other method is constant.	
	public void push (int x) {
		queue.add(x);
		for (int i=0; i<queue.size()-1; i++) {
			queue.add(queue.poll());
		}
	}

	public int peek () {
		return queue.peek();
	}

	public void pop () {
		queue.poll();
	}

	public boolean empty() {
		return queue.isEmpty();
	}
	
}