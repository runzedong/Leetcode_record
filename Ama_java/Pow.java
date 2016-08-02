public class Pow {
	// mention. if n = -2^31 <Integer.MIN_VALUE) 
	// be caution to handler in case of overflow
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        if (n % 2 == 0)
            return myPow(x*x, n/2);
        if (n < 0)
            if (n == Integer.MIN_VALUE)
                return 1/x * myPow(1/x, -(n+1));
            else
                return myPow(1/x, -n);
        return x*myPow(x, n-1);
    }
	
}