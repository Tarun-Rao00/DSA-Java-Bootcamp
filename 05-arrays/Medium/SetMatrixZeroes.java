package Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 1, 0 }, { 1, 1, 1 }, { 1, 1, 0 } };

        setZeroes(matrix);

    }

    public static void setZeroes(int[][] matrix) {
        // int[] pos = { 0, 0 };
        ArrayList<int[]> list = new ArrayList<int[]>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    int[] pos = new int[2];
                    pos[0] = i;
                    pos[1] = j;
                    list.add(list.size(), pos);
                }
            }
        }

        for (int[] arr : list) {
            System.out.println(Arrays.toString(arr));
        }

        // int l = list.size();

        for (int[] arr : list) {

            for (int j = 0; j < matrix[0].length; j++) {
                matrix[arr[0]][j] = 0;
            }
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][arr[1]] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
