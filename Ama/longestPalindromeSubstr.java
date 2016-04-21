public class longestPalindromeSubstr {
    //straightforward method. find longest palindrome substr based on each character
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0)
            return "";
        int maxLen=0;
        String res="";
        String tempstr="";
        for (int i=0;i<s.length();i++){
            tempstr=find(s,i,i);
            if (maxLen<tempstr.length()){
                res=tempstr;
                maxLen=tempstr.length();
            }
            tempstr=find(s,i,i+1);
            if (maxLen<tempstr.length()){
                res=tempstr;
                maxLen=tempstr.length();
            }
        }
        return res;
    }
    public String find(String s,int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}