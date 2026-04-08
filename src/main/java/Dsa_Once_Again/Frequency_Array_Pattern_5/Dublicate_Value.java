package Dsa_Once_Again.Frequency_Array_Pattern_5;

public class Dublicate_Value {
    static void freqarrayone(int[] arr)
    {
        int n=arr.length;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int[] freq=new int[max+1];
        for(int i=0; i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        for(int i=0; i<freq.length;i++)
        {
            if(freq[i]>1)
            {
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String[] args){
        int[] arr={1, 2, 3, 2, 4, 5, 1};
        freqarrayone(arr);



    }
}
