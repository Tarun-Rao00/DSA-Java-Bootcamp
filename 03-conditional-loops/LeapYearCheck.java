import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an year: ");
        int year = sc.nextInt();
        boolean leap = false;

        if(year%4==0){
            leap = true;
        }
        if(year%100==0 && year%400!=0 ){
            leap = false;
        }

        if (leap){
            System.out.println("LEAP YEAR");
        }else{
            System.out.println("NOT A LEAP YEAR");
        }

        sc.close();
    }
}
