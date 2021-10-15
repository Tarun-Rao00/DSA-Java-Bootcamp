import java.util.Scanner;

/**
 * SumOfTwo
 */
public class SumOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The sum is " + sum(a, b));

        sc.close();
        
    }

    static int sum(int a, int b){
        return a+b;
    }
}