package Easy;

// Question- 367 -  https://leetcode.com/problems/valid-perfect-square/

public class PerfectSquare {
    public static void main(String[] args) {
        if(isPerfectSquare(1000000)){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not a perfect square");
        }
//        System.out.println(isPerfectSquare(49));
    }
    public  static  boolean isPerfectSquare(int num){
        long s = 1L;
        long e = num/2;
        long m;

        if(num==1 || num==4 || num==0){
            return true;
        }

        while(s<=e){
            m = s + (e-s)/2;
            if((m*m)==num){
                return true;
            }else if((m*m)>num){
                e = m-1;
            }else if((m*m)<num){
                s = m + 1;
            }
        }
        if((e*e)==num){
            return true;
        }
        return (s*s)==num;
    }
}
