class Solution {
    public int getLeastFrequentDigit(int n) {
        int arr[] = new int[10];
        while (n > 0) {
            arr[n % 10]++;
            n /= 10;
        }
        int ans = -1;
        int count = Integer.MAX_VALUE;
        for (int i = 0; i <= 9; i++) {
            if (arr[i] > 0) {
                if (arr[i] < count) {
                    count = arr[i];
                    ans = i;
                } else if (arr[i] == count) {
                    ans = Math.min(ans, i);
                }
            }
        }
        return ans;
    }
}