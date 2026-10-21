package Dsa_Once_Again.Frequency_Array_Pattern_5;

public class Unique_Element {
    static void finddublicate(int[] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        int[] freq= new int[max+1];
        //For the Count
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
            //only i want to not using extra loop

        }
//Tumko value chahie na index count nhi na chhaiye that why u have to use the freq[arr[i]] not freq[i] which is helpful
        for(int i = 0; i < arr.length; i++)
        {
            if(freq[arr[i]] == 1)
            {
                System.out.println(arr[i]);
            }
        }


    }
    public static void main(String[] args)
    {
        int[] arr={2, 3, 5, 4, 5, 3, 2,6,4};
        finddublicate(arr);
    }
}
