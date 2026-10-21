public class First_Occurance_in_a_String {

    static int firstoccurance(String s, String r) {

        // Outer loop: check every possible starting position in s
        for (int i = 0; i <= s.length() - r.length(); i++) {

            // Assume pattern is found
            boolean found = true;

            // Compare all characters of r with s starting from i
            for (int j = 0; j < r.length(); j++) {

                // Compare characters one by one
                if (s.charAt(i + j) != r.charAt(j)) {
                    found = false; // Pattern mismatch
                    break;
                }
            }

            // If all characters matched, return starting index
            if (found) {
                return i;
            }
        }

        // Pattern not found
        return -1;
    }

    public static void main(String[] args) {

        String s = "sadbutsad";
        String r = "sad";

        System.out.println(firstoccurance(s, r));
    }
}