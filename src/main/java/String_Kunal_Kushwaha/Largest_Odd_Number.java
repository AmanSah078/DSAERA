package String_Kunal_Kushwaha;

public class Largest_Odd_Number {
    static void largestoddd(String str) {
        StringBuilder sb = new StringBuilder();
        //Loop Should be from Right to Left
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);


            if ((ch - '0') % 2 != 0) {   // odd digit
               // System.out.println(str.substring(0, i + 1)); //This give us largest odd number
                System.out.println(ch); // but bhai kewal we can get the odd digit
                break;
            }
//            else {
//                System.out.println('"');
//                break;
//
//            }

            else {
//                System.out.println("\"");
                System.out.println("\" \"");

                break;
            }


        }
    }
    public static void main(String[] args) {
//String s = "504";
        String s= "2042";
largestoddd(s);
    }



}
