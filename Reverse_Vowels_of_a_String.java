class Solution {
    public String reverseVowels(String s) {

        StringBuilder str = new StringBuilder(s);

        int len = s.length();
        int i = 0;
        int j = len - 1;

        char chl = s.charAt(i);
        char chr = s.charAt(j);
        while (i < j) {

            while ((chl != 'A' && chl != 'E' && chl != 'I' && chl != 'O' && chl != 'U' && chl != 'a' && chl != 'e'
                    && chl != 'i' && chl != 'o' && chl != 'u') && i < len - 1) {
                System.out.println(chl + " not ");

                chl = s.charAt(++i);

            }
            System.out.println(chl + " yes at "+i);

            System.out.println("----------");

            while ((chr != 'A' && chr != 'E' && chr != 'I' && chr != 'O' && chr != 'U' && chr != 'a' && chr != 'e'
                    && chr != 'i' && chr != 'o' && chr != 'u') && j > 0) {
                System.out.println(chr + " not ");

                chr = s.charAt(--j);

            }
            System.out.println(chr + " yes at"+j);

            if (i >= j) {
                break;
            } else {

                System.out.println(chl + " " + chr);

                str.setCharAt(i, chr);
                str.setCharAt(j, chl);
                chl = s.charAt(i + 1);
                i++;
                chr = s.charAt(j - 1);
                j--;
            }
        }

        return str.toString();

    }
}