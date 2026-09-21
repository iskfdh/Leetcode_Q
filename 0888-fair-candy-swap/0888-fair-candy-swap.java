class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int as=Arrays.stream(aliceSizes).sum();
        int bs=Arrays.stream(bobSizes).sum();
        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                if(as-aliceSizes[i]+bobSizes[j]==bs-bobSizes[j]+aliceSizes[i])
                    return new int[]{aliceSizes[i], bobSizes[j]};
            }
        }
        return new int[]{-1, -1};
    }
}