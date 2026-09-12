class Solution {
    public int maximumCount(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int nve=0;
        int pve=0;
        while (l <= r) {
    if (nums[l] < 0) nve++;
    if (nums[l] > 0) pve++;

    if (l != r) {
        if (nums[r] < 0) nve++;
        if (nums[r] > 0) pve++;
    }

    l++;
    r--;
}return Math.max(nve,pve);
    }
}