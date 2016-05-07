import java.util.*;
import java.lang.*;

public class isPalindrome {
	public static boolean validPalindrome (String s) {
		int low = 0;
		int high = s.length()-1;
		while (low < high) {
			if (!Character.isLetterOrDigit(s.charAt(low))){
				low++;
				continue;
			}
			else if (!Character.isLetterOrDigit(s.charAt(high))){
				high--;
				continue;
			}
			else if (Character.toLowerCase(s.charAt(low))!=Character.toLowerCase(s.charAt(high))){
				return false;
			}
			else{
				low++;
				high--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "a.";
		if (validPalindrome(s))
			System.out.println(true);
		else
			System.out.println(false);
	}
}