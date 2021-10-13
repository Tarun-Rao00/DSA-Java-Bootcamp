import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int hcf = 1;

        int temp1 = Math.max(a, b);
        int temp2 = Math.min(a, b);

        
        while(temp1-temp2!=0){
            int temp = temp1;
            temp1 = temp2;
            temp2 = Math.max(temp, temp2) - Math.min(temp, temp2);

            if(temp1==temp2){
                System.out.println("HCF is " + temp1 + "\nLCM is " + a * b / temp1);
                // hcf = temp1;
                break;
            }

        }

        // int lcm = a*b/hcf;

        // System.out.println("HCF is " + temp1 + "\nLCM is " + a*b/temp1);


        sc.close();
    }
}
