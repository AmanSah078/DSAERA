public class Count_Zeros {

    public static int countZeros(int[] arr, int start) {

        // Base Case:
        // If we have reached beyond the last index,
        // there are no more elements to check.
        if (start == arr.length) {
            return 0;
        }

        // If current element is 0,
        // count it (1) and recursively count
        // zeros in the remaining array.
        if (arr[start] == 0) {
            return 1 + countZeros(arr, start + 1);
        }

        // Current element is not 0,
        // so don't increase the count.
        // Just check the remaining array.
        return countZeros(arr, start + 1);
    }

    public static void main(String[] args) {

        int[] arr = {0, 5, 7, 0, 9, 0};

        int ans = countZeros(arr, 0);

        System.out.println("Total Zeros = " + ans);
    }
}