package StriverBinarySearch;

public class Floor {
    static int tofloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }

            if (target == arr[start]) {
                return arr[mid];
            }
        }
        return arr[start];
    }
public static void main(String[] args)
        {
            int[] arr={2, 5, 9, 12, 16};
            tofloor(arr, 10);
        }
    }

