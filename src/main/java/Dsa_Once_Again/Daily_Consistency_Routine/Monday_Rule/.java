public class SearchInRotatedArray {

    static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // Mid find karo
            int mid = start + (end - start) / 2;

            // Agar target mil gaya
            if (arr[mid] == target) {
                return mid;
            }

            // Check karo left half sorted hai ya nahi
            if (arr[start] <= arr[mid]) {

                // Target left half ke andar hai
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                }
                // Target left half mein nahi hai
                else {
                    start = mid + 1;
                }
            }

            // Right half sorted hai
            else {

                // Target right half ke andar hai
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                }
                // Target right half mein nahi hai
                else {
                    end = mid - 1;
                }
            }
        }

        // Target nahi mila
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(search(arr, target));
    }
}