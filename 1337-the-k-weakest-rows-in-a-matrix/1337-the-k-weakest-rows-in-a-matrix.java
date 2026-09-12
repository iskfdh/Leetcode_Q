
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int ans[] = new int[k];

        // Strength of every row
        int arr[] = new int[mat.length];
        int arr1[] = new int[mat.length];

        int a = 0;
        int count = 0;

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

        // Copy
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        // Sort strengths
        Arrays.sort(arr1);

        a = 0;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr1[i] == arr[j]) {
                    ans[a] = j;
                    a++;

                    // Mark this row as used
                    arr[j] = -1;

                    break;
                }
            }
        }

        return ans;
    }
}

