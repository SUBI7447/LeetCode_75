// For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

public class Greatest_Common_Divisor_of_Strings {

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        } else {

            int ans = gcd(str1.length(), str2.length());

            return str1.substring(0, ans);
        }

    }

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }

    }

    public static void main(String[] args) {

        String str1 = "ABABAB";
        String str2 = "ABAB";

        System.out.println(gcdOfStrings(str1, str2));

    }

}
