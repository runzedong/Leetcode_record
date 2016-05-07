public class StackToQue {
    private ArrayList<Integer> stack1 = new ArrayList<>();// push
    private ArrayList<Integer> stack2 = new ArrayList<>();// pop
    
    // Push element x to the back of queue.
    public void push(int x) {
        stack1.add(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (stack2.size() == 0)
        {
            while (stack1.size() != 0) 
            {
                stack2.add(stack1.remove(stack1.size()-1));    
            }
        }
        if (stack2.size() != 0)
            stack2.remove(stack2.size()-1);
    }

    // Get the front element.
    public int peek() {
        if (stack2.size() == 0)
        {
            while (stack1.size() != 0) 
            {
                stack2.add(stack1.remove(stack1.size()-1));    
            }
        }
        return stack2.get(stack2.size()-1);
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if (stack1.size() == 0 && stack2.size() == 0)
            return true;
        else
            return false;
    }
}