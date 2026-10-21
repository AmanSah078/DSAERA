public class Longest_SubArray_Sum_K{

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 1, 1, 3, 2, 1};
        int k = 5;

        int maxLength = 0;

        // -------------------------------
        // Step 1: Calculate the sum of the first window (Index 0 to k-1)
        // -------------------------------
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // If the first window itself has sum = k, update the answer.
        if (windowSum == k) {
            maxLength = k;
        }

        // -------------------------------
        // Step 2: Slide the window one position at a time.
        // 'start' represents the starting index of the current window.
        // -------------------------------
        for (int start = 1; start <= arr.length - k; start++) {

            // Remove the previous element that is leaving the window.
            windowSum -= arr[start - 1];

            // Add the new element that is entering the window.
            windowSum += arr[start + k - 1];

            // If the current window sum equals k,
            // then update the maximum length.
            if (windowSum == k) {
                maxLength = Math.max(maxLength, k);
            }
        }

        System.out.println("Longest Length = " + maxLength);
    }
}