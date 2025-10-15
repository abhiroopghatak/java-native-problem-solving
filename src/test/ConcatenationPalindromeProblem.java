package test;
/*
Given a list of unique words, find all pairs of distinct indices (i, j) in the given list so that the concatenation of the two words, i.e., words[i] + words[j], is a palindrome.
Example:
Input: words = ["abcd","dcba","lls","s","sssll"]
Output: [[0,1],[1,0],[3,2],[2,4]]
Explanation: 
The palindromes are ["dcbaabcd","abcddcba","slls","llssssll"]


*/
import java.util.Arrays;

public class ConcatenationPalindromeProblem {
    public static void main(String... a) {
        String[] words = { "abcd", "dcba", "lls", "s","ss", "sssll", "abra" };
      //  String[] words = { "aa","aa"};
      int[][] result = UtilClass.getIndexArrayList(words);
       for (int[] is : result) {
        if(is[0] !=  is[1])
            System.out.println(Arrays.toString(is));
       }
    }
}

class UtilClass {
    static  int[][] getIndexArrayList(String[] words) {
        int[][] result = new int[words.length*(words.length-1)][2];
        int index=0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (UtilClass.isPalindrome(words[i] + words[j])) {
                    System.out.println("=>   "+words[i] + words[j]);
                    result[index][0]=i;
                    result[index][1]=j;
                    index++;
                }
                if (UtilClass.isPalindrome(words[j] + words[i])) {
                    System.out.println("=>   "+words[j] + words[i]);
                    result[index][0]=j;
                    result[index][1]=i;
                    index++;
                }
            }
        }
        return result;
    }

    /**
     * @param s
     * @return
     */
    static boolean isPalindrome(String s) {
       // Remove spaces for clean comparison
        str = str.replaceAll("\\s+", "");
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }
 
}
