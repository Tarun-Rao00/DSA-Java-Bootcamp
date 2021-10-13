import java.util.Scanner;

public class SumNegSumEvenSumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int negSum = 0;
        int evenSum = 0;
        int oddSum = 0;

        int x = 0;

        do{
            x = sc.nextInt();

            if(x<0){
                negSum = negSum + x;
            }
            if(x>0){
                if(x%2==0){
                    evenSum = evenSum +x;
                }else{
                    oddSum = oddSum + x;
                }
            }

        }while(x!=0);

        System.out.println("Sum of negative numbers entered: " + negSum + "\nSum of positive even numbers entered: " + evenSum + "\nSum of positive odd numbers entered: " + oddSum);

        sc.close();
    }
}
