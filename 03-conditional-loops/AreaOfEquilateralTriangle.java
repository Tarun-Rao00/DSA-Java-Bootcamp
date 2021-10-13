import java.util.*;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // a = side of triangle

        float area = (float) (Math.sqrt(3)/4 * a * a);

        System.out.println("The area of Triangle is: " + area);
    
        sc.close();
    }
}
