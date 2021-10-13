import java.util.Scanner;

public class PerimeterOfEqTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a = side of triangle


        int peri = 3*a;

        System.out.println("The perimeter of triangle is: " + peri);

        sc.close();
    }
    
}