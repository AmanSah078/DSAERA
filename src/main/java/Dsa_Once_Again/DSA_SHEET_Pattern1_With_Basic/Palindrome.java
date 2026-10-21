package Dsa_Once_Again.DSA_SHEET_Pattern1_With_Basic;

public class Palindrome {

        //yrr simple if the first element is not equal to last element then not palindrome
    static void findpalindrome(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]!=arr[j])
            {
                System.out.println("Not Palindrome");
                break;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }

}
