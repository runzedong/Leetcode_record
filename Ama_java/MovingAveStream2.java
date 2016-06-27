public class MovingAverage {
    private int windowsize;
    private int[] array;
    private int count;
    private double average;
    /** Initialize your data structure here. */
    
    public MovingAverage(int size) {
        windowsize = size;
        array = new int[size];
        count = 0;
    }
    
    public double next(int val) {
        count++;
        int insert_position = count % windowsize;
        int last = array[insert_position];
        array[insert_position] = val;
        average = (average * Math.min(count-1, windowsize) - last + val) / Math.min(count, windowsize);
        return average;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */