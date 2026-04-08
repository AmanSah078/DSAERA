package StriverArrayQuest;

import java.util.Arrays;

public class Missing_Number {
    static void findmissing(int[] arr)
    {
        int missing=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]!=arr[i]+1)
            {
                missing=arr[i]+1;
            }
        }
        System.out.println(missing);
    }
    public static void main(String[] args)
    {
        //int[] arr={2,3,4,6};
        int[] arr={3,0,1};
        Arrays.sort(arr);
        findmissing(arr);
    }
}
