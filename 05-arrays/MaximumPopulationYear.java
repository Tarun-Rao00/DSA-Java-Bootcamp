import java.util.ArrayList;
import java.util.Collections;

//Question-1854 - Maximum Population year (https://leetcode.com/problems/maximum-population-year)

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{2033,2034},{2039,2047},{1998,2042},{2047,2048},{2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014}};
        int year = maximumPopulation(logs);
        System.out.println(year);
    }
    
    public static int maximumPopulation(int[][] logs) {

        int[] arr = new int[logs.length];

        for (int i = 0; i < logs.length; i++) {
            int x = 0;
            for (int j = 0; j < logs.length; j++) {
                if (logs[i][0] >= logs[j][0] && logs[i][0] < logs[j][1]) {
                    x++;
                }
            }
            arr[i] = x;
        }

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int a = -1;

        ArrayList<Integer> years = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-max==0) {
                a = i;
                years.add(logs[a][0]);
            }
        }
        Collections.sort(years);
        return years.get(0);
    }
}
