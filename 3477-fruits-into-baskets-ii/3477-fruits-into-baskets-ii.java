class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int a=fruits.length;
        int ans=a;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(fruits[i]<=baskets[j]){
                    ans--;
                    baskets[j]=0;
                    break;
                }
            }
        }return ans;
    }
}