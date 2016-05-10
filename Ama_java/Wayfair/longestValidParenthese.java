import java.util.*;

public class longestValidParenthese {
	public static int longestFinder (String s) {
		if (s==null || s.length() == 0)
			return 0;
		int res = 0;
		int start = -1;
		LinkedList<Integer> stack = new LinkedList<>();
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.add(i);
			else
			{
				if (!stack.isEmpty())
				{
					System.out.println(stack.remove(stack.size()-1));
					if (stack.isEmpty())
						res = Math.max(res, i-start);
					else
						System.out.println(stack.peek());
						res = Math.max(res, i-stack.get(stack.size()-1));
				}
				else
					start = i;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		String s = "(()";
		System.out.println(longestFinder(s));
	}
}