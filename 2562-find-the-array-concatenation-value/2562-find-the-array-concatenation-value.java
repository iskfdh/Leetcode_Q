class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans=0;
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int right=nums[r];
            int count=0;
            if(right>=10000) count=100000;
            else if(right>=1000) count=10000;
            else if(right>=100) count=1000;
            else if(right>=10) count=100;
            else count=10;
            ans+=(long) nums[l]* count+right;
            l++;
            r--;
        }if(l==r) ans+=nums[l];
        return ans;
    }
}