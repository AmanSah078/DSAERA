package StriverBinarySearch;

import java.util.Scanner;

public class Celling {
    static int findCelling(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            if (target == arr[mid]) {
                return arr[mid];
            }

        }

        return arr[start];
    }
    public static  void main(String[] args) {
//        int[] arr={2,3,5,9,14,16,18};
//        int target=15;
        int[]arr={2,5,8,12,15};
        int target=7;
        System.out.println(findCelling(arr, target));
    }
}
