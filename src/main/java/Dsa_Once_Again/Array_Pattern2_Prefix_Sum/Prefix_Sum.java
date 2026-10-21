package Dsa_Once_Again.Array_Pattern2_Prefix_Sum;

import java.util.Arrays;

//To add one by one
public class Prefix_Sum {
    static void findprefix(int[] arr)
    {
        //But dude what is problem in this proble we have to use the One special new Arrray which is not optimized solution

        int n=arr.length;
//        int[] pref=new int[n];
//        pref[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            //pref[i]=arr[i-1]+arr[i];
            arr[i] = arr[i-1] + arr[i];
        }
     System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        int[] arr ={2,4,6,8};
        findprefix(arr);
    }
}
