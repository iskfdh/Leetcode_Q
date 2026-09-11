class Solution {
    public int minimumCost(int[] nums) {
        int min = 51, less = 51;
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            if (n < min) {
                less = min;
                min = n;
            } else if (n < less) {
                less = n;
            }
        }

        return nums[0] + min + less;
    }
}