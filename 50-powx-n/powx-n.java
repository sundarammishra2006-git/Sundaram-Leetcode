class Solution {
    public double myPow(double x, int n) {
        long e = n;
        if (e < 0) {
            x = 1 / x;
            e = -e;
        }
        return power(x, e);
    }

    private double power(double x, long e) {
        if (e == 0) 
        return 1.0;
        double half = power(x, e / 2);
        if (e % 2 == 0) 
        return half * half;
        return half * half * x;
    }
}