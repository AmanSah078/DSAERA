package Dsa_Once_Again.DSA_SHEET_PATTERN_2_With_Basic.Revised_Last_Class;

public class count_subarray {
    static void findthecountsubarray(int[] arr, int k)
    {
        int count=0;

        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3};
        findthecountsubarray(arr,3);
    }
}



