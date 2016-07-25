public class LongestSubstrWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (!map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), 1);
            }
            else {
                //encounter the duplicate char.
                if (right - left > max)
                    max = right - left;
                while (s.charAt(left) != s.charAt(right)) {
                    left += map.remove(s.charAt(left));
                }
                left ++;
            }
            right ++;
        }
        max = Math.max(right-left, max);
        return max;
    }
}