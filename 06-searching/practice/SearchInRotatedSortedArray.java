package practice;

/**
 * Search In Rotated Sorted Array --
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 4;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int peak = findPeakElement(nums);
        int s = 0;
        int e = peak;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] > target) {
                e = m - 1;
            }
            if (nums[m] < target) {
                s = m + 1;
            }
        }
        if (s < nums.length) {
            if (nums[s] == target) {
                return s;
            }
        }
        s = peak + 1;
        e = nums.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] > target) {
                e = m - 1;
            }
            if (nums[m] < target) {
                s = m + 1;
            }
        }
        if (s < nums.length) {
            if (nums[s] == target) {
                return s;
            }
        }
        return -1;
    }

    public static int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        if (nums[0] > nums[nums.length - 1]) {
            while (s < e) {
                int m = s + (e - s) / 2;
                if (nums[m] > nums[m + 1]) {
                    return m;
                }
                if (nums[m] > nums[nums.length - 1]) {
                    s = m;
                } else {
                    e = m;
                }
            }
            return s;
        }
        return nums.length - 1;
    }
}