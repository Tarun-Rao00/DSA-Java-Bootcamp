import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4; // There are only 4 perfect numbers  ||||||||||||||||


        int num = 6;
        
        do {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }
            sum = sum - num;
            if (num == sum) {
                System.out.println(sum );
                n--;
            }
            num++;
        }while(n>0);

        sc.close();
    }
}
