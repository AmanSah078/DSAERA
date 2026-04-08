package Dsa_Once_Again.Array_Pattern_Day_1;

public class Rev_Array {

    static void swaparray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reversearray(int arr[], int i, int j) {
        while (i < j) {
            swaparray(arr, i, j);
            i++;
            j--;   // important
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reversearray(arr, 0, arr.length - 1);

        // print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}