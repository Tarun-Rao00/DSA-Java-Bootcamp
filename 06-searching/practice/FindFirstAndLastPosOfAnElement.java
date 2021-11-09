package practice;

import java.util.Arrays;

public class FindFirstAndLastPosOfAnElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7, 7, 7, 7, 7, 8, 9 };
        int target = 7;

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean findStart) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target == nums[m]) {
                ans = m;
                if (findStart) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
            if (target < nums[m]) {
                e = m - 1;
            }
            if (target > nums[m]) {
                s = m + 1;
            }
        }
        return ans;
    }
}
