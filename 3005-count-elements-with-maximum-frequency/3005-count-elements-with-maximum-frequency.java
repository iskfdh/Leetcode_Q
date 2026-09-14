class Solution {
    public int maxFrequencyElements(int[] nums) {
        int a=-1;
        int arr[]=new int[101];
        for(int b:nums){
            arr[b]++;
        }
        for(int i=0;i<arr.length;i++){
            a=Math.max(a,arr[i]);
        }int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a)
            ans+=a;
        }return ans;
    }
}