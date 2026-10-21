package Dsa_Once_Again.Target_50_Questions;

public class RotateArray_By_K {

    //1st i have to swap
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //2nd for the reverse
 static void reverse(int[]arr, int i,int j)
 {

     while(i<j)
     {
         swap(arr,i,j);
         i++;
         j--;
     }
 }

 //3.to final reverse
    static void toreversenow(int[] arr, int k)
    {
        int n=arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        toreversenow(arr,3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
