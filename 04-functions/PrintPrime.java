import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        PrintPrimes(a, b);

        sc.close();
    }

    static void PrintPrimes(int a, int b){
        for(int i = a; i<=b; i++){
            if(prime(i) && i!=1){
                System.out.print(i + " ");
            }
        }
    }

    static boolean prime(int a) {
        int c = 2;
        while (c * c < a) {
            if (a % c == 0) {
                break;
            }
            c++;
        }
        return c * c > a;
    }
}
