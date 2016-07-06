public class StrstrRollingHash {
	public int strStr(String haystack, String needle) {
		if (needle.equals(""))
			return 0;
		int m = needle.length();
		int n = haystack.length();
		if (m > n) 
			return -1;
		long needlehash = 0;
		long haystackhash = 0;
		long tempbase = 1;
		// calculate needle and  haystack[0,m-1] hashcode
		for (int i = m-1; i >=0; i--) {
			needlehash += (int)needle.charAt(i) * tempbase;
			haystackhash += (int)haystack.charAt(i) * tempbase;
			tempbase *= 31;
		}
		if (needlehash == haystackhash)
			return 0;
		tempbase /= 31;
		for (int j = m; j < n; j++) {
			haystackhash = (haystackhash-(int)haystack.charAt(j-m)*tempbase)*31+(int)haystack.charAt(j);
			if (haystackhash == needlehash) {
				//actually at this if statement, you should insert
			    //haystack[j-m+1, j] equals (needlestring) to avoid hash collosion
				return j-m+1;
			}
		}
		return -1;
	}
}