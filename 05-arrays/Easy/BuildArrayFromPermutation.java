package Easy;

/*
Question--

Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

*/



// public class BuildArrayFromPermutation {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        

//         int[] nums = {2, 4, 5,7 ,10, 0};

//         buildArray(nums);

//         sc.close();
//     }

//     public static int[] buildArray(int[] nums) {
//         int[] ans = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             ans[i] = nums[nums[i]];

//         }
//         // System.out.println(Arrays.toString(ans));
//         return ans;
//     }
// }


import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.print("Enter numbers: ");
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = in.nextInt();
        }

    
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Built Array: " + Arrays.toString(buildArray(nums)));

        in.close();
    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }
}