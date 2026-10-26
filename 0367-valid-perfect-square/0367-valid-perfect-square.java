class Solution {
    public boolean isPerfectSquare(int num) {
        long b = 1, a = num;
        while (b <= a) {
            long mid = b + (a - b) / 2;
            if (mid * mid == num)
                return true;
            else if (mid * mid < num)
                b = mid + 1;
            else
                a = mid - 1;
        }
        return false;
    }
}