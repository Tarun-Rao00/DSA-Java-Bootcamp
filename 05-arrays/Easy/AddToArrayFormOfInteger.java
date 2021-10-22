import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {2,7,4};
        int k = 181;

        System.out.println(addToArrayForm(num, k));
    }
    
    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> numl = new ArrayList<>();

        for (int a = num.length - 1; a >= 0; a--) {
            k = k + num[a];
            numl.add(0, k % 10);
            k = k / 10;
        }
        while (k > 0) {
            numl.add(0, k % 10);
            k = k / 10;
        }

        return numl;

    }
}
