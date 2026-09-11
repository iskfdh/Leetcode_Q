class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int or=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&1) == 0){
                or|=nums[i];
            }
        }
        return or;
    }
}