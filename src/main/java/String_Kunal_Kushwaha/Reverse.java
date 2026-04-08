package String_Kunal_Kushwaha;

public class Reverse {
    static void reverse(String str){
        StringBuilder sb = new StringBuilder(); // ✅ yahin bana diya

        for(int i=str.length()-1; i>=0; i--)
        {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
    public static void main(String[] args)
    {
       String str= "Hello";

      reverse(str);
    }
}
