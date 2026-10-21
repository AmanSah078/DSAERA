public class FirstNegative {

    public static void firstNegative(int[] arr, int k) {

        int n = arr.length;

        // Har possible window ke liye loop
        for (int i = 0; i <= n - k; i++) {

            // Maan lo is window mein koi negative nahi hai
            boolean found = false;

            // Current window ke andar search karo
            for (int j = i; j < i + k; j++) {

                // Agar negative mil gaya
                if (arr[j] < 0) {

                    // Print first negative
                    System.out.print(arr[j] + " ");

                    // Flag true kar do
                    found = true;

                    // First negative m il gaya, aur search ki zarurat nahi
                    break;
                }
            }

            // Agar poori window mein negative nahi mila
            if (!found) {
                System.out.print("0 ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        firstNegative(arr, k);
    }
}