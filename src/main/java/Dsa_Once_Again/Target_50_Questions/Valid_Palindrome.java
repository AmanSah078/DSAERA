package Dsa_Once_Again.Target_50_Questions;

public class Valid_Palindrome {
    static boolean isPalindrome(int [] arr) {

        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;

            }
            else {
                i++;
                j--;

            }
        }
        return true;
    }
    public static void main(String[] args)
    {
//        int[] arr={1,5,1};
        int[] arr={1,2,3,2,1};
        boolean result = isPalindrome(arr);
        System.out.println(result);
    }
}
