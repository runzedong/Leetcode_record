import java.util.*;

public class MedianTwoSortedArray {
	public static double findMedian(int[] num1, int[] num2) {
		double median = 0;
		double prev = 0;
		int m1 = num1.length;
		int n2 = num2.length;
		int count = (m1+n2)/2+1;
		int i = 0;
		int j = 0;
		while (count > 0) {
			if (i < m1 && j < n2) {
				if (num1[i] < num2[j]) {
					prev = median;
					median = num1[i];
					i++;
				}

				else {
					prev = median;
					median = num2[j];
					j++;
				}
			}
			else if (i < m1) {
				prev = median;
				median = num1[i];
				i++;
			}
			else if (j < n2) {
				prev = median;
				median = num2[j];
				j++;
			}
			count--;
		}
		System.out.println("median is "+ median);
		System.out.println("prev is "+ prev);
		if ((m1+n2)%2 == 0)
			return (prev+median)/2;
		return median;
	}

	public static void main(String[] args) {
		int[] num1 = {1,2};
		int[] num2 = {3,4};
		System.out.println(findMedian(num1, num2));
	}
}