// find kth smallest number in unsorted array, smallest based from 0
import java.util.*;
public class findKthNumber {
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
		int[] nums = {29,13,7,11,14,3,9,7,12,64,9};
		int kth = 0;
		while (kth < 11) {
		System.out.println("the "+kth+ " NUMS is "+selectKthNumber(nums, 0, nums.length-1, kth));
		kth ++;
		}
	}
}