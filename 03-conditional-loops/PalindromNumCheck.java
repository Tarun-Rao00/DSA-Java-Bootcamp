import java.util.Scanner;

public class PalindromNumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        int old = num;

        int num1 = 0;

        while(num>0){
            int rem = num%10;
            num1 = num1*10 + rem;
            num = num/10;
        }

        if(num1==old){
            System.out.println("The given number is a palindrome number");
        }else{
            System.out.println("NOT a palindrome number");
        }

        sc.close();
    }
}
