package Dsa_Once_Again.DSA_SHEET_Pattern1_With_Basic;

public class Rotate_Array_using_K {
    //
     //swap
    static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //reverse
    static void reverse(int[] arr, int i, int j) {
//        int i=0;
//        int j=arr.length-1;
        while(i<j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotate(int[] arr, int k)
    {
        int n=arr.length;
       reverse(arr,0,n-k-1); //Here each and Everything is from the index Number pr depend kr ta hain tu hi dekh le dude (From 0 to n-k-1 means 0 index to 2 index tk(0,1,2))
       reverse(arr,n-k,n-1);
       reverse(arr,0,n-1);
    }
    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, 4, 5};
        rotate(arr,2);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
