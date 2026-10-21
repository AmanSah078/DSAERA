package Dsa_Once_Again.String_Problem.YesterDay;

public class Palindrome {

    static boolean isPalindrome(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str="race a car";
        str=str.toLowerCase();
        str=str.replaceAll("[^a-z0-9]", "");
        boolean result= isPalindrome(str);
        System.out.println(result);
    }
}
