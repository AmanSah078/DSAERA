package Dsa_Once_Again.Target_50_Questions;

public class Reverse_String {

    static void findthereverse(String str){

        {
            StringBuilder sb = new StringBuilder(str);
     System.out.println(sb.reverse());
        }
    }
    public static void main(String[] args) {
       // String str="hello";
        String str="java";
        findthereverse(str);
    }
}
