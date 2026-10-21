package Per_Day_2Ques;

public class Longest_Common_Prefix {

    static String findthelongestprefix(String[] str)
    {
        //base string le lo taki u can compare from base to remaining
        String base = str[0];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<base.length();i++)
        {
            char ch= base.charAt(i);

            //inner looop to comare the base from the remaining
            for(int j=1; j<str.length;j++)
            {
                if(i >= str[j].length() || str[j].charAt(i) != ch)
                {
                    // common prefix finished
                    //   StringBuilder ko String mein convert karke return karo.
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        String[] str = {"apple","ape","april"};
        String result = findthelongestprefix(str);
        System.out.println(result);
    }
}
