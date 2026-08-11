class Solution {
    public int numSquares(int n) {
        if (isPerfectSquare(n)) return 1;

        for (int i = 1; i * i <= n; i++) {
            if (isPerfectSquare(n - i * i)) return 2;
        }

        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) return 4;


        return 3;
    }

    private boolean isPerfectSquare(int x) {
        int r = (int) Math.sqrt(x);
        return r * r == x;
    }
}
