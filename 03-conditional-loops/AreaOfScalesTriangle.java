import java.util.Scanner;

public class AreaOfScalesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt(); // h = height
        int b = input.nextInt(); // b = base

        float area = h*b/2;

        System.out.println("Area of the triangle is: " + area);

        input.close();
    }
}
