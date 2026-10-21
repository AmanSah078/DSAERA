package Dsa_Once_Again.Practice_Questions_Pair_Wise;

public class plaindrome {
    static void findthepalindrome(String s)
    {


        //ek baar glt hone ke baad ye to one condition u have to print at the last na dude
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                System.out.print("palindrome");
                return;
            }

            i++;
            j--;

        }
        System.out.println("not palindrome");
    }
public static void main(String[] args)

{
    String s="hello";
    findthepalindrome(s);
}
}
