
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int ans[] = new int[k];

        // Number of rows, because we store strength of each row
        int arr[] = new int[mat.length];
        int arr1[] = new int[mat.length];

        int a = 0;
        int count = 0;

        // Find strength of every row
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            arr[a] = count;
            a++;
            count = 0;
        }

        // Copy arr into arr1
        a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        // Sort strengths
        Arrays.sort(arr1);

        boolean used[] = new boolean[arr.length];

        // Find row index for each sorted strength
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr1[i] == arr[j] && !used[j]) {
                    ans[a] = j;
                    used[j] = true;
                    a++;
                    break;
                }
            }
        }

        return ans;
    }
}

