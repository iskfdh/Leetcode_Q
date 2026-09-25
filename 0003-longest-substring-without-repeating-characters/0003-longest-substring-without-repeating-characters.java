class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[] = new int[128];
        int count = 0;
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i++) {
            int x = s.charAt(i);
            while(arr[x] == 1) {
                arr[s.charAt(left)] = 0;
                left++;
                count--;
            }
            arr[x] = 1;
            count++;
            max = Math.max(max, count);
        }
        return max;
    }
}