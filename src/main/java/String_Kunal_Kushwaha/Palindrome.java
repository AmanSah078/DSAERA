package String_Kunal_Kushwaha;

public class Palindrome {
    static void palindrome(String str) {
        StringBuilder sb= new StringBuilder();
        for(int i=str.length()-1; i>=0; i--)
        {
            sb.append(str.charAt(i)); //append(str.charAt(i)) string ke ek character ko result me add karta hai.
        }
        if(str.equals(sb.toString())) //Bhai here toString bascially compare kr rha hain StringBuider ke content se
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
        String str= "madam";
        palindrome(str);
    }
}
