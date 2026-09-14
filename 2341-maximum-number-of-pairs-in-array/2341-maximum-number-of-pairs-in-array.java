class Solution {
    public int[] numberOfPairs(int[] nums) {
        int arr[]=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        int dupe=0;
        int left=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                dupe += arr[i] / 2;
                left += arr[i] % 2;
            }
        }return new int[]{dupe,left};
    }
}