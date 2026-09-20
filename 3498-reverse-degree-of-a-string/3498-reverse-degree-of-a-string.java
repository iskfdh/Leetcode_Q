class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        int count=1;
        for(char ch: s.toCharArray()){
            ans+=(123-(int)ch)*count;
            count++;
        }return ans;
    }
}