class Solution {
    public int findLucky(int[] arr) {
        int freq[] = new int[501];
        int ans = -1;
        for (int n : arr) {
            freq[n]++;
        }
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == i) {
                ans = Math.max(ans, i);
            }
        }
        return ans;
    }
}