import java.util.*;

public class validParenthese {
	public static boolean validTest (String s) {
		if (s == null || s.length() == 0)
			return true;
		LinkedList<Character> stack = new LinkedList<>();
		for (int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
			if (stack.isEmpty() || s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
			{
				stack.add(s.charAt(i));
			}
			else
			{
				if (s.charAt(i) == ')' && stack.get(stack.size()-1) == '(')
					stack.remove(stack.size()-1);
				else if (s.charAt(i) == ']' && stack.get(stack.size()-1) == '[')
					stack.remove(stack.size()-1);
				else if (s.charAt(i) == '}' && stack.get(stack.size()-1) == '{')
					stack.remove(stack.size()-1);
				else
					return false;
			}
			for (Character chr : stack)
				System.out.println("the Stack contains "+chr);
		}
		return stack.isEmpty();
	}
	public static void main (String[] args) { 
		String s = "([]){";
		System.out.println(validTest(s));
	}
}