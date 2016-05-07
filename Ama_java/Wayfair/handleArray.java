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
	public static int[] rearrangeArray2 (int[] nums) {
		if (nums==null || nums.length==0) 
			return new int[0];
		int minusIndex=0;

		for (int i=0; i<nums.length; i++) {
			if (nums[i]<0) {
				if (i!=minusIndex) {
					int temp=nums[i];
					for (int j=i; j>minusIndex; j--)
						nums[j]=nums[j-1];
					nums[minusIndex++]=temp;
				}
			}
		}

		return nums;
	}
	public static void main(String[] args) {
		int[] test = {9,2,-3,1,0,0,-7,-6,4,3,-2,-5};
		rearrangeArray2(test);
		for (Integer n : test) 
			System.out.println(n);
	}
}