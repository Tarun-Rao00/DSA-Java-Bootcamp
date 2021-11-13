package Easy;

// Question 1351 - https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{3,2},{1,0}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int count = 0;

        for(int i = grid.length -1; i>=0; i--){
            int c = 0;

            while(grid[i][c]>=0 && c<grid[i].length-1){
                c++;
            }

            if(grid[i][c]<0){
                count = count + grid[i].length - c;
            }

        }

        return count;
    }
}
