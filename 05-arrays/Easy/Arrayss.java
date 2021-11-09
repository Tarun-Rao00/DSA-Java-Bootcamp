package Easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Arrayss
 */
public class Arrayss {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> num = new ArrayList<>();
  
        num.add(5);
        num.add(1);
        num.add(2);
        num.add(6);
        num.add(10);
        System.out.println(num);
        num.add(0, 2);
        System.out.println(num);
        num.set(5, 5);
        System.out.println(num);
        int l = num.size();
    
        System.out.println("size of num " + l);
    }
}