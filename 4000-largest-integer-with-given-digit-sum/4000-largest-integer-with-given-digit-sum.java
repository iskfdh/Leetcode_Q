class Solution {
    public int largestInteger(int n, int s) {
        if (n * 9 < s) return -1;

        int ans = 0;

        while (n > 0) {
            ans *= 10;

            if (s >= 9) {
                ans += 9;
                s -= 9;
            } else {
                ans += s;
                s = 0;
            }

            n--;
        }

        return ans;
    }
}