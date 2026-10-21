package Dsa_Once_Again.StriverSheet_Sunday_2;

import java.util.Arrays;

public class Remove_Dublicate_From_Array {
    static void findthedublicate(int[] arr){
        for(int i=0;i<arr.length-1;i++)

        {
            if(arr[i]==arr[i+1])
            {
           continue;

            }
            else {
                System.out.print(arr[i] + " ");
            }

        }
      int last=arr[arr.length-1];
        System.out.print(last);
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3};

     findthedublicate(arr);
    }
}
