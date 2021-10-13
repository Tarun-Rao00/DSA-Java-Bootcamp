import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter (p): ");
        double p = sc.nextDouble();
        // p is the principal amount

        System.out.print("Enter (r): ");
        double r = sc.nextDouble();
        // r is the rate of interest(decimal)

        System.out.print("Enter (n): ");
        double n = sc.nextDouble();
        // n is frequency or no. of  times the interest is compounded annually

        System.out.print("Enter (t): ");
        double t = sc.nextDouble();
        // t is the overall tenure

        double ci = p*Math.pow((1+(r/(n*100))), n*t) - p;

        System.out.println("Compounded Interest is = " + ci);



        sc.close();
    }
}
