package Easy;

// Question 441 - https://leetcode.com/problems/arranging-coins/

public class ArrangingCoin {
    public static void main(String[] args) {
        int coins = 11;
        System.out.println(numOfRows(coins));
    }

    public static int numOfRows(int coin){
        int i = 1;
        while(coin>=i){
            coin =  coin-i;
            i++;
        }
        return i-1;
    }
}
