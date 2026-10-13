class Solution {
    public void sortColors(int[] nums) {
        int a[]=new int[3];
        for(int b:nums){
            a[b]++;
        }
        int index=0;
        for(int i=0;i<3;i++){
            while(a[i]>0){
                nums[index]=i;
                index++;
                a[i]--;
            }
        }
    }
}