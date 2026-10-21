package Dsa_Once_Again.Practice_Questions_Pair_Wise;
//3. Valid Anagram
public class valid_anagrams {
    static boolean toknowthevalidanagrams(String s, String t) {
        //first loop i am using for the 1st string

        int[] arr = new int[26];
//one loop for the string
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            arr[ch1 - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch2 = t.charAt(i);
            arr[ch2 - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(toknowthevalidanagrams(s,t));
    }
}
