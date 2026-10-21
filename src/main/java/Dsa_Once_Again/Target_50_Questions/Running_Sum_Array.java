package Dsa_Once_Again.Target_50_Questions;

import java.util.Arrays;

public class Running_Sum_Array {
    static void runningSum(int[] arr) {
        int n=arr.length;
        for(int i =1; i < n; i++){
arr[i]=arr[i-1]+arr[i];
        }
    System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr={3,1,1,1,5};
        runningSum(arr);
    }
}
