package Dsa_Once_Again.Frequency_Array_Pattern_5.Revision;

public class palindrome {
    static void findthepalindrome(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right) {
            if (arr[left] == arr[right]) {

                left++;
                right--;
            } else {
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("palindrome");



    }
    public static void main(String[] args)
    {
        int[] arr={1, 2, 8, 2, 1};
        findthepalindrome(arr);
    }
}
