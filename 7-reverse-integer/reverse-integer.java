class Solution {
    public int reverse(int x) {
        boolean isPositive = x > 0;
        x = Math.abs(x);
        int reverse = 0;
        while (x > 0){
            int modulus = x % 10;
            x = x / 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && modulus > 7))
                return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && modulus < -8))
                return 0;
            reverse = (10 * reverse) + modulus;
        }
        if (!isPositive) return  reverse * -1;
        return  reverse;
    }
}