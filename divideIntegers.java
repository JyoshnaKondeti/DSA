class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);

        int quotient = 0;

        while (dividendL >= divisorL) {
            long temp = divisorL;
            long multiple = 1;
            while (dividendL >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dividendL -= temp;
            quotient += multiple;
        }

        return negative ? -quotient : quotient;
    }
}
