import java.util.Scanner;

public class Factoriall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Factorial is " + fac(n));

        sc.close();
    }

    static int fac(int a){
        int fac = 1;

        for(int i=1; i <=a; i++){
            fac = fac*i;
        }

        return fac;
    }
}
