package practice;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 9, 10, 11, 13, 14, 16, 17 };
        int target = 8;

        System.out.print(CeilingIs((arr), target));
        System.out.print(" -> " + arr[CeilingIs(arr, target)]);
    }
    
    static int CeilingIs(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int m = s + (e - s) / 2;

        while (s <= e) {
            if (target == arr[m]) {
                return m;
            }
            if (target < arr[m]) {
                e = m - 1;
            }
            if (target > arr[m]) {
                s = m + 1;
            }
            m = s + (e - s) / 2;
        }
        if (s > e) {
            return s;
        } else {
            return -5;
        }
    }
}
