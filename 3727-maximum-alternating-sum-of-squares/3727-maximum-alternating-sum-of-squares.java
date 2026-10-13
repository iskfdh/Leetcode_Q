class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
       for(int i=0;i<n;i++){
        nums[i]=Math.abs(nums[i]);
       }
       Arrays.sort(nums);
        long sum = 0;
        long sub = 0;
        
        int half = n / 2;
        for (int i = 0; i < half; i++) {
            sub += (long) nums[i] * nums[i];
        }
        for (int i = half; i < n; i++) {
            sum += (long) nums[i] * nums[i];
        }
        return sum - sub;
    }
}