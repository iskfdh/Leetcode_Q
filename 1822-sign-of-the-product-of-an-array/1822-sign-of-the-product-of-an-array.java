class Solution {
    public int arraySign(int[] nums) {
        int a=1;
        for(int b:nums)
        {
            if(b<0)
            a*=-1;
            else if(b>0)
            a*=1;
            else if(b==0)
            {
                return 0;
            }
        }return a;
    }
}