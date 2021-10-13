import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the MRP: ");
        float mrp = sc.nextFloat();
        System.out.print("Enter discount in percent: ");
        float dis = sc.nextFloat();

        System.out.println("You got discount of: " + dis / 100 * mrp + " ₹\nThe amount you need to pay is: "
                + (mrp - (dis / 100 * mrp)) + " ₹");

        sc.close();
    }
}
