import java.util.HashMap;

class ContainsDublicate {

    static boolean isdublicate(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            // Check whether element already exists
            if (map.containsKey(arr[i])) {
                return true;
            } 
            else {
                map.put(arr[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 1};

        boolean result = isdublicate(arr);

        System.out.println(result);
    }
}