package Dsa_Once_Again.Frequency_Array_Pattern_5.Revision;

import java.util.Arrays;

public class Non_Decreasing_Order {
    static void findthedecreaingorder(int[] arr) {
        int n = arr.length;
        int left=0;
        int right=n-1;
        //u have to use the one new array to store the value got it na dude
        int [] store= new int[n];
        int k=n-1;
      while(left<=right)
        {
            if(Math.abs(arr[left])>Math.abs(arr[right]))
            {
               store[k]=arr[left]*arr[left];
               k--;
               left++;
            }
            else {
                store[k]=arr[right]*arr[right];
                k--;
                right--;
            }
        }
      System.out.println(Arrays.toString(store));
    }
    public static void main(String[] args)
    {
        int[] arr={-7, -3, -1, 2, 4, 8};
        findthedecreaingorder(arr);
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
    }
}
