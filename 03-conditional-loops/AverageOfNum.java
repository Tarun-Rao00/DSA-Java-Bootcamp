import java.util.Scanner;

public class AverageOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("How many numbers you want to get average of? : ");
        int n = sc.nextInt();
        int tem = n;

        int sum = 0;
        while(n>0){
            sum += sc.nextInt();
            n--;
        }

        System.out.println("Average is: " + sum/tem);

        sc.close();
    }
}
