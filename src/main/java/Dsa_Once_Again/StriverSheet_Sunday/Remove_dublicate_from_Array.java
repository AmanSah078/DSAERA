package Dsa_Once_Again.StriverSheet_Sunday;

public class Remove_dublicate_from_Array {

    static void remvoedublicate(int[] arr) {
        //loop from 0 to n-1 because last will be remaining
        for (int i = 0; i<arr.length- 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;

            } else {
                System.out.println(arr[i]);
            }
        }
        int last = arr[arr.length - 1];
        System.out.println(last);

    }
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 3, 3};
        remvoedublicate(arr);
    }
    }
