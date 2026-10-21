package Dsa_Once_Again.DSA_SHEET_Pattern1_With_Basic;

public class Max_Element {
    static void findmax(int[] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
    }
        System.out.print(max);
    }
    public static void main(String[] args)
    {
        int[] arr={12,45,7,89,23};
        findmax(arr);
    }

}
