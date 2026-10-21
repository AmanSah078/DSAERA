package Dsa_Once_Again.Frequency_Array_Pattern_5.Revision;

public class Rotate_by_arr_k {

    //1st swap
   static void swap(int[] arr, int left, int right) {
       int temp=arr[left];
       arr[left]=arr[right];
       arr[right]=temp;
   }

   static void reversearray(int[] arr,int left, int right) {


       while (left < right) {
           swap(arr, left, right);
           left++;
           right--;
       }
   }


     static void findkrev(int[] arr, int k)
       {
           //if the k is greater the array size then

           int n=arr.length;
           k = k % n;
           reversearray(arr,0,n-k-1);
           reversearray(arr,n-k,n-1);
           reversearray(arr,0,n-1);

       }
       public static void main(String[] args)
       {
           int[] arr={0, 20, 30, 40, 50, 60};
           findkrev(arr,3);
           for(int i=0;i<arr.length;i++)
           {
               System.out.print(arr[i]+" ");
           }
       }
   }

