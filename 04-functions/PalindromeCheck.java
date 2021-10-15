import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        palin(n);

        sc.close();
    }

    static void palin(int a) {
        int temp = a;
        int a1 = 0;

        while (a > 0) {
            int rem = a % 10;
            a1 = a1 * 10 + rem;
            a = a / 10;
        }

        if(temp==a1){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a palindrome number");
        }

    }
}
