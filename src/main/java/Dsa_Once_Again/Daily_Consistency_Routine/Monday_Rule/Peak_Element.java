class Peak_Element {

    static void findPeak(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while  (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        System.out.println("Peak Index = " + start);
        System.out.println("Peak Element = " + arr[start]);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 15, 2, 23, 90, 80};

        findPeak(arr);
    }
}class PeakElement {

    static void findPeak(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        System.out.println("Peak Index = " + start);
        System.out.println("Peak Element = " + arr[start]);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 15, 2, 23, 90, 80};

        findPeak(arr);
    }
}