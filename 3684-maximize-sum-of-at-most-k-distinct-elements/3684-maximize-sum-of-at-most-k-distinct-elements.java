class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        HashSet<Integer> a = new HashSet<>();
        for(int i=nums.length-1;i>=0;i--){
            if(k>0){
                if(a.contains(nums[i])){
                    nums[i]=-1;
                }
                else{
                    k--;
                    sum++;
                    a.add(nums[i]);
                }
            }
            else{
                nums[i] = -1;
            }
        }
        int c=0;
        int arr[]=new int[sum];
         for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=-1)
            {
                arr[c]=nums[i];
                c++;
            }
        }return arr;
    }
}