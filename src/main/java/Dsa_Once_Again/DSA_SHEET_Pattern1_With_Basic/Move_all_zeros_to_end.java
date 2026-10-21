package Dsa_Once_Again.DSA_SHEET_Pattern1_With_Basic;

import java.util.Arrays;

public class Move_all_zeros_to_end {
    static void movezerotoend(int[] arr)
    {
        //step-1 to take one new array because u have to chage the arrangement
        int n=arr.length;
        int[] store= new int[n];
        int k=0;
        for(int i=0;i<n;i++)
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
    public static void main(String[] args) {
        int[] arr={0, 1, 0, 3, 12};
        movezerotoend(arr);
    }
}
