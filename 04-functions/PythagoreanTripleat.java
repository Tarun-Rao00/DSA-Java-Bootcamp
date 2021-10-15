import java.util.Scanner;

public class PythagoreanTripleat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        pytha(a, b, c);

        sc.close();
    }

    static int max(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);

        return max;
    }

    static void pytha(int a, int b , int c){
        if(a>c && a>b){
            if(a*a == b*b + c*c){
                System.out.println("Pythagorean Triplet");
            }else{
                System.out.println("Not a pythagorean Triplet");
            }
        }else if(b>a && b>c){
            if(b*b == a*a + c*c){
                System.out.println("Pythagorean Triplet");
            }else{
                System.out.println("Not a pythagorean Triplet");
            }
        }else{
            if(c*c == a*a + b*b){
                System.out.println("Pythagorean Triplet");
            }else{
                System.out.println("Not a pythagorean Triplet");
            }

        }
    }
}
