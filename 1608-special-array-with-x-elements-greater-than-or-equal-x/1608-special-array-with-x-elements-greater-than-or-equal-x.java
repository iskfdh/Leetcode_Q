class Solution {
    public int specialArray(int[] nums) {
        int x = nums.length;
        int[] counts = new int[x+1];
        for(int a : nums)
            if(a >= x)
                counts[x]++;
            else
                counts[a]++;
        int ans = 0;
        for(int i = counts.length-1; i > 0; i--) {
            ans += counts[i];
            if(ans == i)
                return i;
        }
        
        return -1;
    }
}