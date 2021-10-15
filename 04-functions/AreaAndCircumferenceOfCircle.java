import java.util.Scanner;

/**
 * AreaAndCircumferenceOfCircle
 */
public class AreaAndCircumferenceOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        circle(r);

        sc.close();
    }

    static void circle(int r){
        System.out.println("Area of the circle is: " + Math.PI*r*r + " sq. units");
        System.out.println("Circumference of the circle is: " + Math.PI*r*2 + " units");
    }
}