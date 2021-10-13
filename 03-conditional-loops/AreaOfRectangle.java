import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(); // l = length
        int b = sc.nextInt(); // b = breadth

        int area = l*b;

        System.out.println("Area of the rectangle is: " + area);

        sc.close();
    }
}
