class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
        int e=0;
        int o=nums.length-1;
        for(int n:nums){
            if(n%2==0){
                ans[e]=n;
                e++;
            }
            else{
                ans[o]=n;
                o--;
            }
        }return ans;
    }
}