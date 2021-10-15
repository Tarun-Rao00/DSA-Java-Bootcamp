import java.util.Scanner;

public class VotingEligiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        checkEligible(a);

        sc.close();
    }

    static void checkEligible(int a){
        if(a>=18){
            System.out.println("Yes!, you are eligible to vote");
        }else{
            System.out.println("You are NOT eligible to vote");
        }
    }
}
