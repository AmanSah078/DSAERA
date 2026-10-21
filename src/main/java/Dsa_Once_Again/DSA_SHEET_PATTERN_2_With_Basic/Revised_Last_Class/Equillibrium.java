package Dsa_Once_Again.DSA_SHEET_PATTERN_2_With_Basic.Revised_Last_Class;

public class Equillibrium {
    static int findtotalsum(int[] arr) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];

        }
        return totalsum;
    }

    static void findthesubarray(int[] arr) {
        findtotalsum(arr);
        int totalsum = findtotalsum(arr);
        int left = 0;
        for (int i = 0; i < arr.length; i++) {

            int right = totalsum - arr[i]-left;
if(left==right) {
    System.out.println(i);
}
else {
    left=left+arr[i];
}
        }

    }

    public static void main(String[] args)
    {
//        int[] arr={1, 3, 5, 2, 2};
//        int[] arr={1,2,3};
        int[] arr={2, -2, 0, 2, -2};
     findthesubarray(arr);
    }
}
