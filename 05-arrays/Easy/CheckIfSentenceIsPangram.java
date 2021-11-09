package Easy;

public class CheckIfSentenceIsPangram {
    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(sentence));
        
    }

    public static boolean checkIfPangram(String sentence) {
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        boolean[] present = new boolean[26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == letters[i]) {
                    present[i] = true;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (present[i] == false) {
                return false;
            }
        }
        return true;
    }
}



/* 



A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 

Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.




*/