import java.util.HashSet;

class LongestConsecutive {

    static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Store all elements inside the HashSet
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Check every number
        for (int num : nums) {

            // Check if num is the starting point
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Find consecutive numbers
                while (set.contains(currentNum + 1)) {

                    currentNum++;
                    count++;
                }

                // Update maximum length
                maxLength = Math.max(maxLength, count);
            }
        }

        return maxLength;
    }
}