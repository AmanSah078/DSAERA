package Dsa_Once_Again.StriverSheet_Sunday;

public class Second_Largest {
 static void findthemax(int[] arr) {
     int max = arr[0];
     for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max) {
             max = arr[i];
         }
     }
     //this loop for the sl
     int secondlarest = 0;
     for (int i = 0; i < arr.length; i++) {
         if (max > arr[i] && arr[i] > secondlarest) {
             secondlarest = arr[i];
         }
     }
     System.out.println(secondlarest);
 }
 public static void main(String[] args)
 {
    // int[] arr={10,5,20,8};
     int[] arr={3,1,4,2};
     findthemax(arr);
 }
 }

