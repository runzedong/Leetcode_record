import java.util.*;

public class MaxSubarray {
	public static void main(String[] args) {
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		int result=maxSubArray(nums);
		System.out.println("result is "+result);
	}
	public static int maxSubArray(int[] nums) {
		int start=0;
		int end=0;
		int globalMax=nums[0];
		int localMax=nums[0];
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
			else
			{
				globalMax=globalMax;
			}
		}
		System.out.println("start index "+start);
		System.out.println("end index "+end);
		return globalMax;
	}
}