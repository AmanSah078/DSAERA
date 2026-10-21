package Dsa_Once_Again.Practice_Questions_Pair_Wise;

public class Reverse_Array {
    static void findthereversearray(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        for(int k=0; k<arr.length; k++)
        {
            System.out.print(arr[k]+" ");
        }

    }
    public static void main(String[] args)
    {
        int[]arr={1,2,3,4,5};
        findthereversearray(arr);
    }

}
