package Dsa_Once_Again.Array_Pattern3_Sliding_Window;

public class Maxi_Array
{
    static void findmaxsubarray(int[] arr, int days)
    {
        int windowsize=0;
        int max=0;
        //1st loop for the 0 to 2
        for(int i=0; i<days; i++)
        {
            windowsize= windowsize+arr[i];
        }
        //this loop to go to managae the sliding window
        for(int i=1; i<arr.length-days; i++)
        {
            windowsize= windowsize-arr[i-1]+arr[i+days-1];
            if(windowsize>max)
            max=windowsize;

        }
        System.out.println("Maximum no of users visiting " +max);
    }
    public static void main(String[] args)
    {
        int[]arr={100,48,82,57,34,112,65};
        findmaxsubarray(arr,3);
    }
}
