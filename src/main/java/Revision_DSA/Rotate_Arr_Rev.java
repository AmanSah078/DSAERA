package Revision_DSA;

public class Rotate_Arr_Rev {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void revarr(int[]arr, int i , int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
        //now u should tell which one u want to rev
        static void reversearray(int[]arr, int k) {
        int n=arr.length;
        k=k%n;
        revarr(arr,0,n-k-1);
        revarr(arr,n-k,n-1);
        revarr(arr,0,n-1);


    }
    public static void main(String[] args) {
        int[] arr={5, 10, 15, 20, 25, 30};
        int k=4;
        reversearray(arr,4);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
