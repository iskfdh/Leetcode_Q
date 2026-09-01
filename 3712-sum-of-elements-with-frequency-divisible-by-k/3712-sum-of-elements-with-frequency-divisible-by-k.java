class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int arr[]=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%k==0){
                for(int j=0;j<arr[i];j++){
                    sum=sum+i;
                }
            }
        }
        return sum;
    }
}