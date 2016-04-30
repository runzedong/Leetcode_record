import java.util.*;

public class kaiwang {
	public static ArrayList<Integer> maxSubArray(int[] A) {
		ArrayList<Integer> res = new ArrayList<>();
		int max = A[0];
		int temp = 0;
		int start = 0;
		int end = 0;
		int len = A.length;
		for(int i = 0; i < len ; i++){
			if(temp >= 0){
				temp = temp + A[i];
			}else{
				start = i;
				temp = A[i];
			}
			if(max < temp){
				max = temp;
				end = i;
			}
		}
		
		for (int i = start; i <= end; i++) {
			res.add(A[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		int[] A = {-2,1,-3,4,-1,2,1,-5,4};
		ArrayList<Integer> l = maxSubArray(A);
		for (int a : l) {
			System.out.println(a);
		}
	}
}
