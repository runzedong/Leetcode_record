public class MovingAverage {
    private int windowsize;
    private double average;
    private Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        windowsize = size;
        queue = new LinkedList<Integer>();
    }
    
    public double next(int val) {
        int presize = queue.size();
        int last = windowsize == queue.size() ? queue.poll() : 0;
        queue.add(val);
        average = (average * presize - last + val) / queue.size();
        return average;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */