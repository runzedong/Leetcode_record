public class WiggleSort {
	//method.1 sort, n*log(n), then insert half large number into odd index position.
	public void wiggleSort1(int[] nums) {
        Arrays.sort(nums);
        int j = 1;
        int i = (nums.length % 2 == 1) ? (nums.length / 2 + 1) : (nums.length / 2);
        int count = nums.length / 2;
        while (count > 0) {
            swap(nums, i, j);
            i += 1;
            j += 2;
            count --;
        }
        return ;
    }
    
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        return ;
    }
    //method.2 straight-forward method, switch the max one into odd index position O(n)
    public void wiggleSort2(int[] nums) {
        int maxIndex = (nums.length % 2 == 0) ? (nums.length - 1) : (nums.length - 2);
        int i = 1;
        while ( i <= maxIndex) {
            if (nums[i-1] > nums[i]) {
                int temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
            }
            if (i < nums.length - 1 && nums[i+1] > nums[i]) {
                int temp = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = temp;
            }
            i += 2;
        }
    }
	
}