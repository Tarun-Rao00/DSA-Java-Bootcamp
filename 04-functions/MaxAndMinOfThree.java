import java.util.Scanner;

public class MaxAndMinOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("The maximum number is: " + max(a, b, c));
        System.out.println("The minimum number is: " + min(a, b, c));


        sc.close();
    }


/* Method 1

    static int max(int a, int b, int c){
        int max = Math.max(Math.max(a, b), c);

        return max;
    }

    static int min(int a, int b, int c){
        int min = Math.min(Math.min(a, b), c);

        return min;                                     // we can also return the above statement directly
    }

*/

// Method 2

    static int max(int a, int b, int c){

        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if(b>c){
                return b;
            }else{
                return c;
            }
        }
    }

    static int min(int a, int b, int c){

        if(a<b){
            if(a<c){
                return a;
            }else{
                return c;
            }
        }else{
            if(b<c){
                return b;
            }else{
                return c;
            }
        }
    }

}
