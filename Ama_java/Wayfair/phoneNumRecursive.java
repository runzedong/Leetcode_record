import java.util.*;

public class phoneNumRecursive {
	public static ArrayList<String> numberRecursive (String digits) {
		ArrayList<String> result = new ArrayList<>();
		if (digits.length()==0)
		{
			return result;
		}
		int idx = 0;
		String temp ="";
		helper(digits,result,temp,idx);
		return result;
	}
	
	static void helper (String digits, ArrayList<String> res, String temp, int idx) {
		if (temp.length() == digits.length())
		{
			res.add(temp);
			return;
		}
		System.out.println(digits.charAt(idx));
		System.out.println(getLetter(digits.charAt(idx)));
		for (char letter : getLetter(digits.charAt(idx)).toCharArray())
		{
			System.out.println(letter);
			helper(digits, res, temp+letter, idx+1);
		}

	}
	static String getLetter(char digit) {
		switch (digit){
			case '2':
				return "abc";
			case '3':
				return "def";
			case '4':
				return "ghi";
			case '5':
				return "jkl";
			case '6':
				return "mno";
			case '7':
				return "pqrs";
			case '8':
				return "tuv";
			case '9':
				return "wxyz";
			case '0':
				return " ";
			default:
				return "";
		}
	}
	public static void main(String[] args) {
		String digits = "23";
		ArrayList<String> res = new ArrayList<>();
		res = numberRecursive(digits);
		for (String e : res)
			System.out.println(e);
	}
}