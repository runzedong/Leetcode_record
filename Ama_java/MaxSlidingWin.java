public class MaxSlidingWin {
	static class PQcomparator implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return b-a;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums==null || nums.length==0)
            return new int[0];
        int[] result=new int[nums.length-k+1];
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, new PQcomparator());
        for (int i=0;i<k;i++){
            queue.add(nums[i]);
        }
        for (int j=0; j<nums.length-k;j++){
            result[j]=queue.peek();
            queue.remove(nums[j]);
            queue.add(nums[j+k]);
        }
        result[nums.length-k]=queue.peek();
        return result;
    }
}