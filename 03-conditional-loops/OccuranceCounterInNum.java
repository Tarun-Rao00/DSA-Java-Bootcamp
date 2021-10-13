import java.util.Scanner;

/**
 * OccuranceCounterInNum
 */
public class OccuranceCounterInNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a large number: ");
        int num = sc.nextInt();
        int num1 = num;
        System.out.print("Enter the number of which occurances you want to count: ");
        int occurOf = sc.nextInt();

        int count = 0;


        while(num>0){
            int rem = num%10;

            if(rem==occurOf){
                count++;
            }

            num = num/10;
        }
        System.out.println(occurOf + " is occuring " + count + " times in " + num1);

        sc.close();
    }
}