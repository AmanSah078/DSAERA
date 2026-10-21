package Dsa_Once_Again.Frequency_Array_Pattern_5.Revision;

import java.util.Arrays;

public class move_zero_at_end {
    //
    static void movezerotoend(int[] arr)
    {
        int n=arr.length;
        int k=0;
        int[] store=new int[n];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                store[k]=arr[i];
                k++;
            }
        }
        while(k<n)
        {
            store[k]=0;
            k++;
        }
        System.out.println(Arrays.toString(store));
    }
    public static void main(String[] args)
    {
        int[] arr={0, 1, 0, 3, 12};
        movezerotoend(arr);

    }
}
