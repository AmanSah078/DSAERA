package Ramzan_DSA_Challenge.Two_Pointer_Prob;

public class Left_Rotate {
    static void findleftrotate(int[] arr)
    {
        int last=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }

   arr[arr.length-1]=last;

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        findleftrotate(arr);
    }
}
