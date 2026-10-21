package Dsa_Once_Again.Binary_Search_Problems;

public class Smallest_Letter {

    static int findthesmallest(char[] letters, char target)
    {
        int start=0;
        int end=letters.length;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target>letters[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
//There is not any need of to find the mid because why u should use because u we want the char greater than the target but in the
            //greatest letters that should be small .
        }
        return letters[start%letters.length];
    }
    public static void main(String[] args)
    {
        char[] letters={'c','f','j'};
      char result= (char) findthesmallest(letters,'c' );
      System.out.println(result);
    }
}
