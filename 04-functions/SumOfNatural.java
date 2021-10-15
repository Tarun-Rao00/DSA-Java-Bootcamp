import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The of first " + n + " natural numbers is  = " + sum(n));

        sc.close();
    }

    static int sum(int n){

        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
        }

        return sum;
    }
}
