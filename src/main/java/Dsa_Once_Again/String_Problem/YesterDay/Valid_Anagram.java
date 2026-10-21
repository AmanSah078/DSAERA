package Dsa_Once_Again.String_Problem.YesterDay;

public class Valid_Anagram {
    static boolean findthevalidanagram(String str1,String str2){

        int[] arr= new int[26];
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            arr[ch-'a']--;
        }
        //now the final loop
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s1= "anagram";
        String s2= "nagaram";
        boolean b=findthevalidanagram(s1,s2);
        System.out.println(b);
    }
}
