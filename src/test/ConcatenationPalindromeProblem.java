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
        boolean result = false;
        if (s == null || s.trim().isEmpty()) {
            System.out.println("empty string received in isPalindrome function");
        
        } else {
            s = s.replaceAll("\\s", "");
            if(s.equals(reverseString(s))){
                result=true;
            }
           
        }
        return result;
    }

    static String reverseString(String s){
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            // front of the existing string
            r = ch + r; 
        }

        return r;
    }
}
