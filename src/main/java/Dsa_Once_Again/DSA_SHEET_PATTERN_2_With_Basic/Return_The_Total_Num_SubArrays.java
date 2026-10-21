package Dsa_Once_Again.DSA_SHEET_PATTERN_2_With_Basic;

public class Return_The_Total_Num_SubArrays {
    //To find the total sum
    static int findtotalsum(int[] arr)
    {
        int totalsum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalsum+=arr[i];
        }
        return totalsum;
    }
    static void tofindtheprefsum(int[] arr, int k)
    {
        int totalsum=findtotalsum(arr);
        int prefsum=0;
        int suffixsum=0;
        for(int i=0;i<arr.length;i++)
        {
            prefsum+=arr[i];
            suffixsum=totalsum-prefsum;
            if(k==suffixsum)
            {
                System.out.println(i);
            }
        }
    }
    public  static void main(String[] args)
    {
        int[] arr={1,2,3};
        tofindtheprefsum(arr,3);
    }
}
