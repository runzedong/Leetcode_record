import java.util.*;
// in this problem even though there are two duplicate numbers
// they still count different kth largest numbers
public class KthLargestNum {
	public static void main(String[] args) {
		int k=4;
		int[] nums={3,2,3,1,2,4,5,5,6};
		System.out.println("method 1.")
		int result=findKthLargest(nums,k);
		System.out.println(k+" largest num is "+result);

		System.out.println("method 2.");
		int result2=findKthLargestWithPQ(nums,k);
		System.out.println(k+" largest num is "+result2);
		
		System.out.println("method 3.")
		int result3=findKthLargestQuickSelect(nums,k);
		System.out.println(k+" largest num is "+result2);
	}
// method 1.
// built-in sort function. 
// sort function time complexity (NlogN)
	public static int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length-k];
	}
// method 2.
// use priority queue to build max-heap. 
// time complexity of maintain max-heap is (logN)<worst case>
	static class PqComparator implements Comparator<Integer> {
		public int compare(Integer a, Integer b) {
			return b-a;
		}
	}
	public static int findKthLargestWithPQ(int[] nums, int k) {
		PriorityQueue<Integer> queue=new PriorityQueue<>(nums.length, new PqComparator());
		for (Integer n: nums){
			queue.add(n);
		}
		for (int i=0; i<k-1; i++){
			queue.poll();
		}
		return queue.peek();
	}
// method 3.
// use quicksort idea. but not need to sort, just find the pivot we need
// 
	public static int findKthLargestQuickSelect(int nums, int k) {

	}
	public static int FreakfindKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		int count=1;
		int i;
		for (i=nums.length-1; i>0; i--){
			if (count==k)
				break;
			else
			{
				if (nums[i]!=nums[i-1])
					count++;
			}
		}
		return nums[i];
	}
}
