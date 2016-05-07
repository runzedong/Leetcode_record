public class reverseStr {
    public String reverse1(String s) {
        if (s.length()==0)
            return "";
        char[] res = new char[s.length()];
        for (int i=0; i<s.length(); i++) {
            res[i] = s.charAt(s.length()-1-i);
        }
        return new String(res);
    }
    public String reverse2(String s) {
    	if (s.length()==0) 
    		return "";
    	char[] sChar = s.toCharArray();
    	int start=0;
    	int end=sChar.length-1;
    	while (start<end) {
    		char temp = sChar[start];
    		sChar[start] = sChar[end];
    		sChar[end] = temp;
    		start++;
    		end--;
    	}
    	return new String(sChar);
    }
}