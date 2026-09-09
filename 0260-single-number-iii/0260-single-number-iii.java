class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[]=new int[2];
        if(nums.length==2) return nums;
        int a=0;
        int i=0;
        Arrays.sort(nums);
        while(i<nums.length){
            if (a==2){return ans;}
            if(i==nums.length-1 || nums[i]!=nums[i+1]){
                ans[a]=nums[i];
                i++;
                a++;
            }else
            i+=2;
        }return ans;
    }
}