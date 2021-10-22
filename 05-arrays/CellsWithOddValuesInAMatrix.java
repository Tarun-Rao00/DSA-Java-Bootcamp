
// 14. [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)
public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};

        int ans = oddCells(m, n, indices);

        System.out.println(ans);
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            for (int x = 0; x < n; x++) {
                matrix[indices[i][0]][x]++;
            }
            for (int x = 0; x < m; x++) {
                matrix[x][indices[i][1]]++;
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (odd(matrix[i][j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean odd(int a) {
        return a % 2 != 0;
    }
}