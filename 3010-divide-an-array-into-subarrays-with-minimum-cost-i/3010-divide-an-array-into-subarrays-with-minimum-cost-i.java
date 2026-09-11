class Solution {
    public int minimumCost(int[] nums) {
        
        int min1=51;
       int min2=51;
        if(nums.length==3){
            int ans=0;
            for(int a:nums){
                ans+=a;
            }return ans;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min1){
                min2=min1;
                min1=nums[i];
            }else if(nums[i]<min2){
            min2=nums[i];
            }
        }return nums[0]+min1+min2;
    }
}