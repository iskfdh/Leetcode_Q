class Solution {
    public int returnToBoundaryCount(int[] nums) {

        int a = 0;
        int count = 0;

        for (int x : nums) {
            a += x;
            if (a == 0) {
                count++;
            }
        }
        return count;
    }
}