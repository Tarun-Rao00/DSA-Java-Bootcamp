import java.util.ArrayList;
import java.util.Arrays;

//Question 566 - Reshape the Matrix  (https://leetcode.com/problems/reshape-the-matrix/)


public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int c=4;
        int r=1;

        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }
    
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                list.add(mat[i][j]);
            }
        }

        int[][] reshape = new int[r][c];
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (list.size() != r * c) {
                    return mat;
                }
                reshape[i][j] = list.get(k);
                k++;

            }
        }

        return reshape;
    }
}
