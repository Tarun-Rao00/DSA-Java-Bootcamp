package Easy;

// Question 349 - https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,3};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for(int i=0; i<nums1.length; i++){
            for(int j =0; j<nums2.length; j++){
                while(i<nums1.length-1 && nums1[i]==nums1[i+1]){
                    i++;
                }
                while(j<nums2.length-1 && nums2[j]==nums2[j+1]){
                    j++;
                }

                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                }

            }
        }

        int[] arr = new int[list.size()];

        for(int i=0; i<arr.length; i++){
            arr[i]=list.get(i);
        }

        return arr;
    }
}
