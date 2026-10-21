package Dsa_Once_Again.DSA_SHEET_Pattern1_With_Basic;

public class Check_Array_Sorted_Or_Not {
static boolean findthesort(int[] arr) {

    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]>arr[i+1])
        {
            return false;
        }
    }
    return true;
}
public static void main(String[] args)
{
    int[] arr={1,7,3,4,5};
    boolean result=findthesort(arr);
    System.out.println(result);
}
}
