package Easy;

// Que 35 - https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;

        System.out.println(searchIndex(arr, target));
    }
    public static int searchIndex(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int m = 0;

        while(s<=e){
            m = s + (e-s)/2;
            if(target==arr[m]){
                return m;
            }
            if(arr[m]<target){
                s = m+1;
            }
            if(arr[m]>target){
                e = m-1;
            }
        }

        return s;
    }
}
