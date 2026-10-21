package Dsa_Once_Again.Practice_Questions_Pair_Wise;

public class IsPalindrome {

    static void findPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                System.out.println("Not Palindrome");
                return;
            }

            start++;
            end--;
        }

        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        String str = "madam";
        findPalindrome(str);
    }
}