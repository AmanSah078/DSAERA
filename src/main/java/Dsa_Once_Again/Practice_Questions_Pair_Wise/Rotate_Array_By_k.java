package Dsa_Once_Again.Practice_Questions_Pair_Wise;

public class Rotate_Array_By_k {
  static void swap(int[] arr,int i,int j)
  {

   int temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
  }
  //this is second method for the reverse
    static void reverse(int[] arr,int i,int j)
    {

        while(i<j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    //now its time to reverse
    //so first revertse wiil be from 0 to till 3 that mean 0 to
    // n-k+1
    static void rotate(int[] arr,int k)
    {
        int n=arr.length;
        k = k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr,3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

