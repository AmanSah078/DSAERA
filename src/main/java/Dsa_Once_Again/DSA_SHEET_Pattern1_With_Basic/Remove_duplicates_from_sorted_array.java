package Dsa_Once_Again.DSA_SHEET_Pattern1_With_Basic;

public class Remove_duplicates_from_sorted_array {
    static void removedublicates(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                continue;
            }
            else {
                System.out.print(arr[i]+" ");
            }
        }
        int last=arr[arr.length-1];
        System.out.print(last);
    }
    public static void main(String[] args)
    {
        int[] arr={1, 1, 2, 2, 3, 4, 4};
        removedublicates(arr);
    }
}
