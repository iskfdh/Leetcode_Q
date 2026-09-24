class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
                
            if(nums[i]>9){int sum=0;
            while(nums[i]>0){
                sum+=nums[i]%10;
                nums[i]/=10;
                }
                if(sum==i) return i;
            }
            else if(nums[i]==i) return i;
        }
        return -1;
    }
}