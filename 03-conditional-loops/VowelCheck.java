import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        Character ch = sc.next().charAt(0);

        if(ch.equals('a') || ch.equals('e') || ch.equals('i') || ch.equals('o') || ch.equals('u') || ch.equals('A')
                || ch.equals('E') || ch.equals('I') || ch.equals('O') || ch.equals('U')){
            System.out.println("Vowel");
        }else{
            System.out.println("NOT a Vowel");
        }


        sc.close();
    }
}