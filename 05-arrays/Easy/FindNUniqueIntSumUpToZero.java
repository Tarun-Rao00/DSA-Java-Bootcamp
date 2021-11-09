package Easy;

import java.util.Arrays;

//Question-1304 - Find N Unique integers sum up to zero (https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)

public class FindNUniqueIntSumUpToZero {
    public static void main(String[] args) {
        int n =10;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    
    public static int[] sumZero(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n / 2; i++) {
            arr[i] = i + 1;
            arr[n - 1 - i] = -(i + 1);
        }
        return arr;
    }
}
