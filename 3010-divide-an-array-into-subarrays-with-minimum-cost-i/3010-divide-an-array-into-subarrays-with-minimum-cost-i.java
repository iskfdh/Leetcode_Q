class Solution {
    public int minimumCost(int[] nums) {
        
        int min1=51;
       int min2=51;
        for(int i=1;i<nums.length;i++){
            int n=nums[i];
            if(n<min1){
                min2=min1;
                min1=n;
            }else if(n<min2){
            min2=n;
            }
        }return nums[0]+min1+min2;
    }
}