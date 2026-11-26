class Solution {
    public boolean canAliceWin(int n) {
         int ans=10;
        int count=0;
        while(n>=ans){
            n-=ans;
            ans--;
            count++;
        }
        if(count%2==0){
            return false;
        }
        else{
            return true;
        }
    }
}