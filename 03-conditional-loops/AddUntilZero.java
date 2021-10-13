import java.util.Scanner;

public class AddUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int sum = 0;

        do{
            a = sc.nextInt();
            sum = sum + a;
        }while(a!=0);

        System.out.println(sum);


        sc.close();
    }
}
