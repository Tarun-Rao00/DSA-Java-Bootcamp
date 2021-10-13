import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;

        if (n == 1) {
            sum = 0;
        } else if (n == 2) {
            sum = 1;
        } else {
            for (int i = 0; i < n - 1; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }

        }

        System.out.println("The " + n + "th term is " + sum);

        sc.close();
    }
}