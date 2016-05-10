import java.util.*;

public class Test {
	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<>();
		stack.add(0);
		stack.add(1);
		stack.add(2);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}