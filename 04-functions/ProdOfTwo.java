import java.util.Scanner;

public class ProdOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The product is " + prod(a, b));

        sc.close();

    }

    static int prod(int a, int b) {
        return a * b;
    }
}
