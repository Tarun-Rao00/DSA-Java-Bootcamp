import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int size = text.length();

        String rev = "";

        while(size > 0){
            rev = rev + text.charAt(size-1);
            size--;
        }

        System.out.println(rev);

        sc.close();
    }
}