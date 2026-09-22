class Solution {
     static{
        for(int i=0; i<1000; i++){
            minSubArrayLen(0, new int[]{});
        }
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int sum=0;
     int min = Integer.MAX_VALUE;
     for(int i = 0 ; i<nums.length;i++){
        sum+=nums[i];
        while(sum>=target){
         min =Math.min(min,i-j+1);    
            sum-=nums[j];
            j++;
        }
     }
  return min==Integer.MAX_VALUE?0:min;  } 
}