import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt(); // r = radius of circle

        double area = 3.14*r*r;

        System.out.println("Area of the circle is: " + area);
        
        input.close();
    }
    
}