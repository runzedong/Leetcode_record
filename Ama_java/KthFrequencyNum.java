import java.util.*;

public class KthFrequencyNum {
    static class Counter {
        private int number;
        private int amount;
        public Counter(int value) {
            number = value;
            amount = 1;
        }
        public void increase() {
            amount ++;
        }
        public int getvalue() {
            return this.number;
        }
        public int getamount() {
            return this.amount;
        }
        //public int compare (Counter c1, Counter c2) {
        //    return c1.amount - c2.amount;
        //}
        
    }
    
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<Integer>();
        Map<Integer, Counter> map = new HashMap<Integer, Counter>();
        PriorityQueue<Counter> queue = new PriorityQueue<Counter>(k, new Comparator<Counter>() {
            public int compare (Counter c1, Counter c2) {
                return c1.amount- c2.amount;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            if (map.isEmpty()) {
                map.put(nums[i], new Counter(nums[i]));
            }
            else {
                
                if (map.containsKey(nums[i])) {
                map.get(nums[i]).increase();
                }
                else {
                    map.put(nums[i], new Counter(nums[i]));
                }
            }
        }
        
        for (Integer c : map.keySet()) {
            if (queue.isEmpty() || queue.size() < k) {
                queue.offer(map.get(c));
            }
            
            else {
                if (map.get(c).getamount() > queue.peek().getamount()) {
                    queue.poll();
                    queue.offer(map.get(c));
                }
            }
        }
        for (Counter c : queue) {
            res.add(c.getvalue());
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        for (Integer i : topKFrequent(nums, k)) {
            System.out.println("most frequency is "+ i);
        }
    }
}