package Dsa_Once_Again.Frequency_Array_Pattern_5.Revision;

public class Rev {
    static void swap(int[] arr,int left, int right)

    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    //now the main
   static void findtherev(int[] arr, int left, int right)
   {
       while(left<right)
       {
           swap(arr,left,right);
           left++;
           right--;
       }
   }
   public static void main(String[] args)
   {
       int[] arr={1,2,3,4,5};
       findtherev(arr,0,arr.length-1);
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
   }
}
