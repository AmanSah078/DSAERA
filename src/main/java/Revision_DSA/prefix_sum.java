package Revision_DSA;

import java.util.Arrays;

public class prefix_sum {
    static void findprefixsum(int[] arr)
    {
        int n=arr.length;
        for(int i=1; i<n; i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        int[] arr={5,1,3,2};
        findprefixsum(arr);
    }
}
