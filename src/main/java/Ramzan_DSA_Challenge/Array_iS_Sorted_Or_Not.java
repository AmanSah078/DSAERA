package Ramzan_DSA_Challenge;

public class Array_iS_Sorted_Or_Not {
    static boolean findsorted(int[] arr)
    {
    for(int i=0; i<arr.length-1;i++)
    {
       if(arr[i]>arr[i+1])
       {
           return false;
       }
    }
    return true;
    }
    public static void main(String args[])
    {
        int[] arr={1, 2, 3, 4, 5};
        boolean b=findsorted(arr);
        System.out.println(b);
    }

}
