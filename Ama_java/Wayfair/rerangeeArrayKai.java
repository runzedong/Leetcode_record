import java.util.*;

public class rerangeeArrayKai {
	public static void main(String[] args) {

		int[] a = {1,2,3,0,0,-1,2,-8,-11,3};
		for (int n : a){
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println();
		mv(a);
		for (int i : a) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
	public static void mv(int[] a) {
		int insertP = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				int tmp = a[insertP];
				a[insertP] = a[i];
				a[i] = tmp;
				insertP++;
			}
		}
	}
}
