//
//        👉 Example 1 (TCS / Infosys):
//
//Given an array of integers, find the number of subarrays whose sum is equal to a given value k.
//
//        👉 Example 2 (Accenture):
//
//Count all contiguous segments whose sum matches the target.
//
//👉 Example 3 (Amazon type):
//
//Given an integer array, return the total number of continuous subarrays whose sum equals k.
//        👉 (Expected: O(n) solution)








package Dsa_Once_Again.DSA_SHEET_PATTERN_2_With_Basic;

public class Count_SubArray {
    static void findthesubarray(int[] arr, int k)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {

            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==k)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public  static void main(String[] args)
    {
        int[] arr={1,2,3};
        findthesubarray(arr,3);

    }
}

