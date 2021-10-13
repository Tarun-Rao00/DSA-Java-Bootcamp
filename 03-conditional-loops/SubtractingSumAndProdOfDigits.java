import java.util.Scanner;

public class SubtractingSumAndProdOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: " );
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;

        while(num>0){
            int rem = num%10;

            sum = sum +rem;
            prod = prod * rem;

            num = num/10;
        }

        int diff = prod - sum;

        if(diff<0){
            diff = -diff;
        }

        System.out.println("The difference between the sum and the product of digits of the number is: " + diff);

        sc.close();
    }
}
