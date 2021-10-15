import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        primeOrNot(a);

        sc.close();
    }

    static void primeOrNot(int a){

        if(prime(a) && a!=1){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

    }

    static boolean prime(int a){
        int c = 2;
        while(c*c<a){
            if(a%c==0){
                break;
            }
            c++;
        }
        return c*c>a;
    }
}
