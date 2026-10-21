package Dsa_Once_Again.StriverSheet_Sunday_2;

public class Left_Rotate_By_K_Places {
    //1st we should find the swap method
    static void swap(int[] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //2nd need to reverse
    static void reverse(int [] arr,int i, int j) {

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    //3rd to reverse in the sequence

    static void rotatearray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4, 5};
        rotatearray(arr, 2);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}


