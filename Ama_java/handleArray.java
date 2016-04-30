import java.util.*;

public class handleArray {
	public static int[] rearrangeArray (int[] nums) {
		if (nums==null || nums.length==0) 
			return new int[0];
		int[] res = new int[nums.length];
		int index=0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]<0) {
				res[index]=nums[i];
				index++;
			}
		}
		for (int j=0; j<nums.length; j++) {
			if (nums[j]>=0) {
				res[index]=nums[j];
				index++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] test = {9,2,-3,1,0,0,-7,-6,4,3,-2,-5};
		int[] result = rearrangeArray(test);
		for (Integer n : result) 
			System.out.println(n);
	}
}