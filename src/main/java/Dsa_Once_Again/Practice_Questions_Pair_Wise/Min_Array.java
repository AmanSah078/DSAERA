package Dsa_Once_Again.Practice_Questions_Pair_Wise;

public class Min_Array {
    static void findtheminelement(int[] arr)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)

            {
                min= arr[i];
            }
        }
        System.out.print(min+" ");
    }
    public static void main(String[] args)
    {
        int[] arr={10,5,3,20,25};
        findtheminelement(arr);
    }
}
