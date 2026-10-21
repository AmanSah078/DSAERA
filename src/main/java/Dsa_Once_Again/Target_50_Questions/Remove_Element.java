package Dsa_Once_Again.Target_50_Questions;

import java.util.Scanner;

public class Remove_Element {
    static void RemoveElement(int[] arr,int value)
    {
        int store=0;
        int n=arr.length;


        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==value)
            {
              //  store=arr[i];
            continue;

            }
            else {
                System.out.print(arr[i]+  " ");
            }

        }

    }
    public static void  main(String[] args)
    {
     //int[] arr={3,2,2,3};
        int[] arr={0,1,2,2,3,0,4,2};
     RemoveElement(arr,2);
    }
}
