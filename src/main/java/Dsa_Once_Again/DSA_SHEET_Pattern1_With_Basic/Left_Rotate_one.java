package Dsa_Once_Again.DSA_SHEET_Pattern1_With_Basic;

public class Left_Rotate_one {
    static void rotateonce(int[] arr)
    {
        int left=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        for(int i=0; i<arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        arr[arr.length-1]=left;
        System.out.print(arr[arr.length-1]);

    }
   public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        rotateonce(arr);
    }
}
