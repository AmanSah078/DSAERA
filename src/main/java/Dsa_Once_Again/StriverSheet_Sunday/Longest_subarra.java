package Dsa_Once_Again.StriverSheet_Sunday;

public class Longest_subarra {
    static void findthelongestsubarray(int[] arr, int k)

    {
        int max=0;
        int windowsize=0;
        //first turm
        for(int i=0; i<k; i++)
        {
            windowsize=windowsize+arr[i];
        }
        //now to mantainging the sliding window
        for(int i=0; i<arr.length-k; i++)
        {
            windowsize=windowsize-arr[i]+arr[i+1];
            if(windowsize>max)
            {
                max=windowsize;
            }
        }
        System.out.println("Maximum no of users visiting " +max);
    }
    public static void main(String[] args)
    {
        int arr[]={1, 2, 1, 1, 1, 3, 2};
        int k=3;
        findthelongestsubarray(arr, k);
    }
}
