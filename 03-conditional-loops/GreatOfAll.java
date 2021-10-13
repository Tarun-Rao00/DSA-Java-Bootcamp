import java.util.Scanner;

public class GreatOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int a = 0;

        do{
            a = sc.nextInt();
            if(a>max){
                max = a;
            }
        }while(a!=0);

        System.out.println(max);

        sc.close();
    }
}
