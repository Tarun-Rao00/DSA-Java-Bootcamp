import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // h stands for height
        int b = sc.nextInt(); // b stands for base (width of the side which is perpendicular to height)

        int area = b*h;

        System.out.println("Area of parallelogram is: " + area);

        sc.close();
    }
}
