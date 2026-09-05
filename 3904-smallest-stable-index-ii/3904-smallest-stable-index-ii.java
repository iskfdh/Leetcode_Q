class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int a=nums[0];
        int ans=-1;
        int[] min = new int[nums.length];
        min[nums.length - 1] = nums[nums.length - 1];
        for (int i=nums.length-2;i>=0;i--) {
            min[i] = Math.min(min[i + 1], nums[i]);
        }
        for (int i=0;i<nums.length;i++) {
            a=Math.max(a, nums[i]);
            if((a - min[i]) <= k) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}