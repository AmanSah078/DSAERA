package Dsa_Once_Again.StriverSheet_Sunday;

public class unique {
    static void findtheunique(int[] arr)
    {

        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }

        int[] freq=new int[max+1];
        for(int i=0; i<arr.length; i++)
        {
            freq[arr[i]]++;
        }

        for(int i=0; i<arr.length; i++)
        {
            if(freq[arr[i]]==1)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr={2, 2, 1, 4, 4};
        findtheunique(arr);
    }
}
