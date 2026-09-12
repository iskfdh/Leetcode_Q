class Solution {
    public int maximumCount(int[] nums) {
    int nve=0;
    int pve=0;
    for(int a:nums){
        if(a<0)nve++;
        if(a>0) pve++;
    }
    return Math.max(nve,pve);
    }
}