package Ramzan_DSA_Challenge;

import com.sun.source.doctree.SeeTree;

public class Dublicate_Array {
    static  void finddublicate(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                continue;

            }
            else
            {
                System.out.println(arr[i]);
            }
        }
        int last =arr[arr.length-1];
        System.out.println(last);
    }
    public static void main(String[] args)
    {
        int[] arr={1, 1, 2, 2, 3, 4, 4};
        finddublicate(arr);
    }

}
