import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt(); // r = radius of circle

        double peri = 2* Math.PI* r;

        System.out.println("Perimeter/Circumference of the circle is: " + peri);

        input.close();
    }
}
