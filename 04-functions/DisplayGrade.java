import java.util.Scanner;

public class DisplayGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        getGrade(m);

        sc.close();
    }

    static void getGrade(int a){
        if(a>100){
            System.out.println("Wrong Input");
        }
        if(a>90 && a<=100){
            System.out.println("AA");
        }
        if(a>80 && a<=90){
            System.out.println("AB");
        }
        if(a>70 && a<=80){
            System.out.println("BB");
        }
        if(a>60 && a<=70){
            System.out.println("BC");
        }
        if(a>50 && a<=60){
            System.out.println("CD");
        }
        if(a>40 && a<=50){
            System.out.println("DD");
        }
        if(a<=40){
            System.out.println("FAIL");
        }
    }
}
