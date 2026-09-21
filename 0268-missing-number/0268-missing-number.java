class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
            ans=i;
            flag=true;
            break;
            }
        }
        if(!flag)return nums.length;
        else
        return ans;
    }
}