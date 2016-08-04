public class WiggleSort2 {
    public static void wiggleSort(int[] nums) {
        int median = selectKthNumber(nums, 0, nums.length-1, nums.length/2);
        System.out.println("median is "+ median);
        int odd = 1;
        int even = (nums.length % 2 == 0)? nums.length - 2: nums.length - 1;
        int[] result = new int[nums.length];
        System.out.println("initial odd from "+odd);
        System.out.println("initial even from "+even);
        for (int i = 0; i < nums.length; i++) {
        	System.out.println("nums at i "+nums[i]);
            if (nums[i] > median) {
                result[odd] = nums[i];
                odd += 2;
            }
            else if (nums[i] < median) {
                result[even] = nums[i];
                even -= 2;
            }
        }
        System.out.println("out of for odd is "+ odd);
        System.out.println("out of for even is "+ even);
        while (odd < nums.length) {
            result[odd] = median;
            odd += 2;
        }
        
        while (even >= 0) {
            result[even] = median;
            even -= 2;
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }
    
    public static int selectKthNumber(int[] nums, int left, int right, int n) {
		if (left == right) {
			return nums[left];
		}
		int pivotIndex = partition(nums, left, right);
		while (n != pivotIndex) {
			if (n < pivotIndex) {
				pivotIndex = partition(nums, left, pivotIndex-1);
			}
			else {
				pivotIndex = partition(nums, pivotIndex+1, right);
			}
		}
		return nums[n];
	}

	public static int partition(int[] nums, int left, int right) {
		int pivotSelect = left + (int) (Math.random()*(right-left));
		int temp = nums[left];
		nums[left] = nums[pivotSelect];
		nums[pivotSelect] = temp;
		int pivotValue = nums[left];
		int start = left;
		for (int i = start+1; i <= right; i++) {
			if (nums[i] <= pivotValue) {
				start++;
				temp = nums[start];
				nums[start] = nums[i];
				nums[i] = temp;
			}
		}
		nums[left] = nums[start];
		nums[start] = pivotValue;
		return start;
	}

	public static void main(String[] args) {
		int[] nums = {1,5,1,1,6,4};
		wiggleSort(nums);
		for(Integer i : nums) {
			System.out.println("wigglesort "+ i);
		}	
	}
	
}