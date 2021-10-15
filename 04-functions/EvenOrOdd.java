import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        even(a);

        sc.close();
    }
    static void even(int a){
        if(a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
