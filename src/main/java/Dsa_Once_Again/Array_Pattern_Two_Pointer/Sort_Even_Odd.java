package Dsa_Once_Again.Array_Pattern_Two_Pointer;

public class Sort_Even_Odd {
    static void tosortEvenOdd(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                //swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8};
        tosortEvenOdd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
