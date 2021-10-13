import java.util.Scanner;

public class PrintReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = 0;

        while(num>0){

            int rem = num%10;

            n1 = n1*10 + rem;

            num = num/10;
        }

        System.out.println("The reverse is: " + n1);
        
        sc.close();
    }
}
