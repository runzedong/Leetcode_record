import java.util.*;

public class Sub {
	private static int max = 0;
	private static int tmp = 0;
	private static ArrayList<ArrayList<Integer>>res;
	public static ArrayList<ArrayList<Integer>> maxSubArray(int[] A) {
		int point = 0;
		ArrayList<Integer> subres = new ArrayList<>();
		res = new ArrayList<>();
		helper(point, subres, A );
		return res;
	}
	private static void helper(int point,ArrayList<Integer> subres, int[] nums) {		
		if (point == nums.length ) {
			return;
		}
		tmp += nums[point];
		if (tmp >= 0) {
			subres.add(nums[point]);		
		}else {
			subres = new ArrayList<>();
			tmp=0;

		}
		if (max < tmp) {
			res = new ArrayList<>();
			max = tmp;
			res.add(new ArrayList<Integer>(subres));
		}else if (max == tmp) {
			res.add(new ArrayList<Integer>(subres));
		}
		helper(point+1, subres, nums);
	}
	public static void main(String[] args) {
		int[] A = {0,5,6,0,0};
		ArrayList<ArrayList<Integer>> l = maxSubArray(A);
		for (ArrayList<Integer> a : l) {
			System.out.println("hhhhhh " + a.size());
			for (int x : a) {
				System.out.println(x);
			}
		}
	}
}
