class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int ans[]=new int[2];
        HashSet<Integer> a =new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a.contains(grid[i][j])){
                    ans[0]=grid[i][j];
                }
                a.add(grid[i][j]);
            }
        }
        for(int i=1;i<=n*n;i++){
            if(a.contains(i)){
                continue;
            }
            else{
                ans[1]=i;
            }
        }return ans;
    }
}