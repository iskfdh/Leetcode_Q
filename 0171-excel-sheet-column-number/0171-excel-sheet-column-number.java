class Solution {
    public int titleToNumber(String s) {
        int sum=0;
        for(char a:s.toCharArray()){
            sum*=26;
            sum+=a-'A'+1;
        }return sum;
    }
}