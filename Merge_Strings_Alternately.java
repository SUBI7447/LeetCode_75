// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
// starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.

import java.util.*;

public class Merge_Strings_Alternately {

    public static String mergeAlternately(String word1, String word2) {

        String ans = "";

        int len_1 = word1.length();
        int len_2 = word2.length();

        int i = 0;
        int j = 0;

        for (i = 0, j = 0; i < len_1 && j < len_2; i++, j++) {
            ans = ans + word1.charAt(i) + word2.charAt(j);
        }
        while (i < len_1) {
            ans = ans + word1.charAt(i);
            i++;

        }
        while (j < len_2) {
            ans = ans + word2.charAt(j);
            j++;

        }

        return ans;

    }

    public static void main(String[] args) {

        String word1 = "ab";
        String word2 = "pqrs";

        System.out.println(mergeAlternately(word1, word2));

    }

}
