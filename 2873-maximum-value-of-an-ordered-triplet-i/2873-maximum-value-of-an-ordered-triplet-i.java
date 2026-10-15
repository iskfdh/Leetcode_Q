class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                int k=i+1;
                while(j>k){
                    ans=Math.max(ans,(long)(nums[i] - nums[k]) * nums[j]);
                    k++;
                }
            }
        }return Math.max(0,ans);
    }
}