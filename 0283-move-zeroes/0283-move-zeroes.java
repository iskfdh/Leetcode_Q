class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
            {
                ans[right]=0;
                right--;
            }else{
                ans[left]=nums[i];
                left++;
            }
        }for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
}