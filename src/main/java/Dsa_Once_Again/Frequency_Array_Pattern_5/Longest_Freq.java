package Dsa_Once_Again.Frequency_Array_Pattern_5;

public class Longest_Freq {
    static void findlargestcount(int[] arr)
    {
        int max=arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        int freq[]= new int[max+1];
        //for the count
        for(int i = 0; i < arr.length; i++)
        {
            freq[arr[i]]++;
        }
        int maxi=0;
        int element=-1;
        for(int i = 0; i < freq.length; i++)
        {
            if(freq[i]>maxi)
            maxi=freq[i];
            element=i;
        }
      System.out.println(element);
    }
    public static void main(String[] args)
    {
       // int[] arr={1,3,2,3,4,3,5};
        int[]arr={7, 2, 7, 3, 2, 7, 4};
        findlargestcount(arr);
    }
}
