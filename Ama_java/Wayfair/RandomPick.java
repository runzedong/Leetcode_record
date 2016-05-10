import java.util.*;
import java.lang.*;

public class RandomPick {
	public static void randomSelectKth (int[] nums, int k) {
		for (int i=0; i<k; i++) {
			int j=(int) (Math.random()*(nums.length-i))+i;
			System.out.println("random number is "+j);
			swap(nums, i, j);
		}
	}

	private static void swap (int[] nums, int a, int b) {
		int temp=nums[a];
		nums[a]=nums[b];
		nums[b]=temp;
	}

	public static void main (String[] args) {
		int[] nums = {10,11,12,13,14,15,16,17,18,19};
		int k=3;
		for (int e : nums)
			System.out.println(e);
		randomSelectKth(nums,k);
		System.out.println("after select");
		for (int e: nums)
			System.out.println(e);
	} 
}