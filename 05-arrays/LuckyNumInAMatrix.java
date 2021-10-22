import java.util.ArrayList;
import java.util.List;

// Qoestion 1380 - Lucky Number in a Matrix (https://leetcode.com/problems/lucky-numbers-in-a-matrix/)

public class LuckyNumInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        System.out.println(luckyNumbers(matrix));
    }
    
    public static List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int r = 0; r < matrix[i].length; r++) {
                    min = Math.min(min, matrix[i][r]);
                }

                for (int c = 0; c < matrix.length; c++) {
                    max = Math.max(max, matrix[c][j]);
                }

                if (matrix[i][j] == max && matrix[i][j] == min) {
                    list.add(matrix[i][j]);
                }

            }
        }

        return list;
    }
}