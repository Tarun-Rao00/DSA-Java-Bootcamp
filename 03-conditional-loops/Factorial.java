import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =  sc.nextInt();

        int fac = 1;
        while(n>0){
            fac *= n;
            n--;
        }

        System.out.print("Factorial = " + fac);

        sc.close();
    }
}
