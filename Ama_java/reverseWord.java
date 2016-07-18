public class Solution {
    public String reverseWords(String s) {
        if (s == null)
            return null;
        s = s.trim();
        if (s.length() == 0)
            return "";
        int walker = s.length();
        int runner = walker - 1;
        StringBuilder result = new StringBuilder();
        while (runner >= 0) {
            while (runner >= 0 && s.charAt(runner) != ' ') {
                runner --;
            }
            result.append(s.substring(runner+1, walker));
            result.append(" ");
            while (runner >= 0 && s.charAt(runner) == ' '){
                runner--;
            }
            walker = runner + 1;
        }
        result.append(s.substring(0, walker));
        return result.toString().trim();
    }
}