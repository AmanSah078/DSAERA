package Dsa_Once_Again.DSA_SHEET_PATTERN_2_With_Basic;

public class Range_Of_The_Query {

    static void findtheprefsum(int[] arr, int l, int r) {

        int n=arr.length;
        for (int i = 1; i <n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        int range=0;

            if(l==0)
            {
                range=arr[r];
            }
            else {
                range=arr[r]-arr[l-1];
                System.out.print(range);
            }



    }
    public static void main(String[] args) {
//        int[] arr={2,4,1,3,6};
        int[] arr={7,2,5,1,9,3};
        findtheprefsum(arr,1,4);
    }
}
