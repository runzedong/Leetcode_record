public class minStack{
    ArrayList<Integer> stack=new ArrayList<>();
    ArrayList<Integer> minstack=new ArrayList<>();
    int temp;
    public void push(int x) {
        stack.add(x);
        if (minstack.isEmpty() || x<=minstack.peek())
            minstack.add(x);
    }

    public void pop() {
        if (stack.isEmpty())
            return;
        int temp=stack.remove(stack.size()-1);
        if (!minstack.isEmpty() && temp==minstack.peek())
            minstack.remove(minstack.size()-1);
    }

    public int top() {
        if (!stack.isEmpty())
            return stack.peek();
        return 0;
    }

    public int getMin() {
        if (!minstack.isEmpty())
            return minstack.peek();
        return 0;
    }
}
