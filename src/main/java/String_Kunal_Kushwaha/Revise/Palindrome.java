package String_Kunal_Kushwaha.Revise;

public class Palindrome {
    static void tofindthepalindrome(String str)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=str.length()-1; i>=0; i--)
        {
            sb.append(str.charAt(i));
        }
        if(str.equals(sb.toString()))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args)
    {
        String str="mam";
        tofindthepalindrome(str);
    }
}
