public class singleNumber {
	// we assume only one number appear once and others appear twice.
    public int singleNumberI(int[] nums) {
        if (nums==null || nums.length==0)
            return 0;
        int res=nums[0];
        for (int i=1; i<nums.length; i++) {
            res^=nums[i];
        }
        return res;
    }

    // there only one number appear onece and others appear three times
    public int singleNumberII(int[] nums) {
        int[] digit = new int[32];
        for (int i=0; i<32; i++) {
            for (int j=0; j<nums.length; j++) {
                digit[i] += (nums[j] >> i)&1;
            }
        }
        
        int res=0;
        for (int k=0; k<32; k++){
            res += (digit[k]%3) << k;
        }
        return res;
    }
    
    public int singleNumberIImap (int[] nums) {
        int res=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else if (map.get(nums[i])==2)
                map.remove(nums[i]);
            else
                map.put(nums[i],2);
        }
        for (Integer i : map.keySet())
            int res = i;
        return res;
    }

    
}