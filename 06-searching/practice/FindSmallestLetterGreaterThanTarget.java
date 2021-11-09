package practice;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr  = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
        char target = 'e';
        System.out.println(Answer(arr, target));
    }
    
    static char Answer(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target < letters[m]) {
                e = m-1;
            } else {
                s = m + 1;
            }
        }
        
        return letters[(s%letters.length)];
    }
}