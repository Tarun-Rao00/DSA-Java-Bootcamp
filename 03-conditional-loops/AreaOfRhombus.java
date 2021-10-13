import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();  // p = length of diagnol
        int q = sc.nextInt();  // q = length of another diagnol

        int area = p*q/2;

        System.out.println("The area of the rhombus is : " + area);


        sc.close();
    }
}
