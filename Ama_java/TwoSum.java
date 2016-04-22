public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums==null || nums.length<2)
            return null;
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++)
        {
            if (map.containsKey(nums[i]))
            {
                result[0]=map.get(nums[i]);
                result[1]=i;
                return result;
            }
            else
            {
                map.put(target-nums[i],i);
            }
        }
        return null;
    }
}