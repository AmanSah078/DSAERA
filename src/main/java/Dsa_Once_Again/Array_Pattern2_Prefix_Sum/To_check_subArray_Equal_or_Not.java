package Dsa_Once_Again.Array_Pattern2_Prefix_Sum;

public class To_check_subArray_Equal_or_Not {

    static int findArraySum(int[] arr)
    {
        int totalsum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalsum+=arr[i];
        }
        return totalsum;
    }
    static boolean equalPartition(int[] arr)
    {
        int totalsum=findArraySum(arr);

        int prefsum=0;
        for(int i=0;i<arr.length;i++)
        {
            prefsum=prefsum+arr[i];
            int suffixsum=totalsum-prefsum;
            if(suffixsum==prefsum)
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
//        int[] arr={5,3,2,6,3,1};
        int[] arr={1,3,5,6,2,1};
        System.out.println(equalPartition(arr));
    }

}