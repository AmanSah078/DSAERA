package Dsa_Once_Again.Array_Pattern_Two_Pointer;


public class Rotate_Array_Rev {
    //Swap logics
    static void swaparray(int[] arr, int i, int j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
        //To call the swaparray
        static void  reversearray(int[] arr, int i, int j)
        {
            while(i<j)
            {
                swaparray(arr, i, j);
                i++;
                j--;
            }
        }
        //Now for the 2nd part
//   static void rotatearray(int[] arr, int k)
//   {
//       int n=arr.length;
//       //not need of copy temp to store the value bcz i already used the reverse
//       //for the 2nd part
//
//   }
    static void rotatearray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reversearray(arr, 0, n - k - 1);
        reversearray(arr, n - k, n - 1);
        reversearray(arr, 0, n - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=3;
        rotatearray(arr,k);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }



}
