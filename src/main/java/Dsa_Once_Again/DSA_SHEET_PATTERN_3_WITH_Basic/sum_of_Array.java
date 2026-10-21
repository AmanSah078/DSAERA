package Dsa_Once_Again.DSA_SHEET_PATTERN_3_WITH_Basic;

public class sum_of_Array {

    static void findthesumofArray(int[] arr)
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        System.out.print(sum);
    }
    public static void main(String[] args)
    {
        //int[] arr={1,2,3,4};
        int[] arr={5,10,15};
        findthesumofArray(arr);
    }
}
