import java.util.*;

public class MaxSubarray {
	public static void main(String[] args) {
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		int[] A = {0,5,6,0,0};
		ArrayList<Integer> result=maxSubArray(A);
		System.out.println("result is ");
		for (Integer n : result)
			System.out.println(n);
	}
	public static ArrayList<Integer> maxSubArray(int[] nums) {
		int start=0;
		int end=0;
		int globalMax=nums[0];
		int localMax=nums[0];
		ArrayList<Integer> res = new ArrayList<>();
		for (int i=1; i<nums.length; i++) {
			if (nums[i]>localMax+nums[i])
			{
				localMax=nums[i];
				start=i;
			}
			else
			{
				localMax=localMax+nums[i];
			}
			if (localMax>globalMax)
			{
				globalMax=localMax;
				end=i;
			}
		}
		for (int i=start; i<=end; i++) {
			res.add(nums[i]);
		}
		return res;
	}
}