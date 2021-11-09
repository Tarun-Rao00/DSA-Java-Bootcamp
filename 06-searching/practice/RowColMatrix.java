package practice;

import java.util.Arrays;

/**
 * RowColMatrix
 */
public class RowColMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,5,9,19},{2,7,10,22},{4,8,12,25},{6,11,13,29}};
        int target = 6;

        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length-1;



        while(c>=0 && r<matrix.length){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }
            if(matrix[r][c]>target){
                c--;
            }
            if(matrix[r][c]<target){
                r++;
            }
        }

        return new int[] {-1,-1};
    }
}