class Solution {
    public int minBitFlips(int start, int goal) {
        int position = 32 - Integer.numberOfLeadingZeros(Math.max(start,goal));
        int c=0;
        for(int i = 0; i < position; i++){
            if(((start >> i) & 1)== ((goal >> i) & 1)){
                continue;
            } else {c++;
            }
        }
        return c;
    }
}