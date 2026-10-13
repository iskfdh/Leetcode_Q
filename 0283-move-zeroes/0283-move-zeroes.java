class Solution {
    public void moveZeroes(int[] nums) {
        int ans[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            {
                ans[right]=0;
                right--;
            }else{
                ans[left]=nums[i];
                left++;
            }
        }for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}