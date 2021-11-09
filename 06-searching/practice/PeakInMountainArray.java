package practice;

//Question --  https://leetcode.com/problems/peak-index-in-a-mountain-array/


public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};

        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m + 1] && arr[m] > arr[m - 1]) {
                return m;
            }
            if (arr[m] < arr[m + 1]) {
                s = m + 1;
            }
            if (arr[m] > arr[m + 1]) {
                e = m - 1;
            }

        }
        return s;
    }
}
