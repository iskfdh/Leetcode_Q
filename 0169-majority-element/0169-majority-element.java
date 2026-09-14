class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[nums.length/2]){ans=nums[i];
            break;}
        }return ans;
    }
}