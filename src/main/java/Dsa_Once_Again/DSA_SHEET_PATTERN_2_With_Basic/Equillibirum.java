package Dsa_Once_Again.DSA_SHEET_PATTERN_2_With_Basic;

public class Equillibirum {
    //1st i should find the total sum
    static int findthetotalsum(int[] arr)
    {
        int totalsum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalsum+=arr[i];
        }
        return totalsum;
    }
    static void findtheequilibrium(int[] arr)
    {
        findthetotalsum(arr);
        int totalsum=findthetotalsum(arr);
        int leftsum=0;
       for(int i=0;i<arr.length;i++)
       {
           int rightsum=totalsum-arr[i]-leftsum;
           if(leftsum==rightsum)
           {
               System.out.print(i);
           }
           else {
               leftsum=leftsum+arr[i];
           }
       }

    }
    public static void main(String[] args)
    {
//        int[] arr={1, 3, 5, 2, 2};
        int[] arr={2,4,2};
        findtheequilibrium(arr);
    }
}
