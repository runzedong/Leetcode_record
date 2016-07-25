import java.util.*;

public class KthLargestNum {
    public static int findKthLargest(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int pivot = partition(nums, start, end);
        System.out.println("Initial pivot is "+ pivot);
        displayNums(nums);
        while (pivot != nums.length-k) {
            if (pivot > nums.length-k) {
                start = 0;
                end = pivot-1;
                pivot = partition(nums, start, end);   
            }
            
            else {
                start = pivot+1;
                end = nums.length-1;
                pivot = partition(nums, start, end);
            }
        }
        
        return nums[pivot];
    }
    
    public static int partition(int[] nums, int start, int end) {
        int pivotValue = nums[start];
        int pivotPoint = start;
        for (int i = start+1; i <= end; i++) {
            if (nums[i] <= pivotValue) {
                start ++;
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
            }
        }
        nums[pivotPoint] = nums[start];
        nums[start] = pivotValue;
        return start;
    }

    public static void displayNums (int[] nums) {
        for (Integer i : nums) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        int k = 1;
        findKthLargest(nums, k);
    }
}