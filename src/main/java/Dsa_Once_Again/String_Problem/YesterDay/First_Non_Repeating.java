package Dsa_Once_Again.String_Problem.YesterDay;

//Given a string s of lowercase English letters, the task is to find the first non-repeating character.
//If there is no such character, return '$'.

public class First_Non_Repeating {
    static char findthefirstnonrepeating(String s){
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            arr[ch-'a']++;
        }
        //one more loop to decide the what is happeining
//        for(int i=0;i<26;i++)
        for(int i=0; i<s.length(); i++)
        {
            char ch= s.charAt(i);
            if(arr[ch-'a']==1)
            {
                return ch;
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s="geeksforgeeks";
        char result=findthefirstnonrepeating(s);
        System.out.println(result);
    }
}
