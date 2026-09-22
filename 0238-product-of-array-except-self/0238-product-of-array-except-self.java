class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            p *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                ans[i] = p / nums[i];
            }
            else {
                int p2 = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (i != j)
                        p2 *= nums[j];
                }
                ans[i] = p2;
            }
        }

        return ans;
    }
}