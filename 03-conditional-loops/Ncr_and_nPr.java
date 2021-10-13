import java.util.Scanner;

public class Ncr_and_nPr {

    public static int Factorial(int a) {
        int fac = 1;
        if (a > 1) {
            fac = Factorial(a - 1) * a;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();

        int ncr = Factorial(n) / (Factorial(n - r) * Factorial(r));

        int npr = ncr * Factorial(r);

        System.out.println("nCr = " + ncr + "\nnPr = " + npr);

        sc.close();
    }
}