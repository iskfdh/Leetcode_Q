class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int ans[]=new int[queries.length];
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<nums.length;j++)
            if(nums[j]<=queries[i]){
                ans[i]=j+1;
            }
        }return ans;
    }
}