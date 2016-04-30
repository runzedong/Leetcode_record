/*
 *this program is used to randomly choose k nums from int[] N <k<n>
 *or the array can be a stream, when the stream end, we can randomly
 *select kth from that stream, and there is also a weighted random sampling algorithm\
 *Math.random() generate double [0.0 1.0) so start from index based on 1.
*/
import java.util.*;
import java.lang.Math;

public class randomKthNums {
	public static int[] selectKthNum1 (int[] nums, int k) {
		int[] res = new int[k];
		for (int i=0; i<k; i++) {
			res[i] = nums[i];
		}
		for (int i=k+1; i<=nums.length; i++) {
			int j = (int) (Math.random()*i+1);
//			System.out.println("random nums "+j);
			if (j<=k)
				res[j-1]=nums[i-1];
		}
		return res;
	}
	public static int[] selectKthNum2 (int[] nums, int k) {
		class ComparatorP implements Comparator<Entity> {
			public int compare(Entity a, Entity b) {
				double diff = a.getPriority()-b.getPriority();
				if (diff>0)
					return 1;
				else if (diff==0)
					return 0;
				else
					return -1;
			}
		}

		class Entity {
			int value;
			double priority; 
			Entity(int n, double p) {
				value=n;
				priority=p;
			}
			public int getValue() {
				return value;
			}
			public double getPriority() {
				return priority;
			}
		}

		int[] res = new int[k];
		PriorityQueue<Entity> queue = new PriorityQueue<Entity>(k,new ComparatorP());
		for (int i=0; i<k; i++) {
			queue.add(new Entity(nums[i], Math.random()));
		}
		for (Entity e : queue)
			System.out.println("init queue "+e.getValue()+" it's p "+e.getPriority());
		for (int i=k; i<nums.length; i++) {
			Entity temp = new Entity(nums[i],Math.random());
			System.out.println("the peek of the queue "+queue.peek().getPriority());
			System.out.println("the temp Entity is "+temp.getPriority());
			if (queue.peek().getPriority() < temp.getPriority()){
				queue.poll();
				queue.add(new Entity(temp.getValue(), temp.getPriority()));
			}
		}

		for (int i=0; i<k; i++)
			res[i]=queue.poll().getValue();
		return res;
	}

	public static void main(String[] args) {
		int[] test = new int[10];
		for (int k=1; k<=10; k++){
			test[k-1]=k;
		}
		for (Integer k:test)
			System.out.println(k);

		int[] rec = selectKthNum2(test, 3);
		for (Integer e : rec)
			System.out.println(e);
	}
}