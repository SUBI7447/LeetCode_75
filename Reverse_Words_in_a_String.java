// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. 
//The returned string should only have a single space separating the words. Do not include any extra spaces.

class Solution {
    public String reverseWords(String s) {

        int len = s.length();

        String ans = "";

        for (int i = len-1; i >= 0; i--) {

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i == -1) {
                break;
            }

            int j = i;

            while (j >= 0 && s.charAt(j) != ' ') {

                j--;

            }

            

            ans = ans + " " + s.substring(j + 1, i + 1);

            i = j;

        }

        return ans.substring(1);

    }
}