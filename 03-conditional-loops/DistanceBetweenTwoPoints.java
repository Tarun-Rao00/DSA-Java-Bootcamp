import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates of first point: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter coordinates of second point: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Distance = " + Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));

        sc.close();
    }
}