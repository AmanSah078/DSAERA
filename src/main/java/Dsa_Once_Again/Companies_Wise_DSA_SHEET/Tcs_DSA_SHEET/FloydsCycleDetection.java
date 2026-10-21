class FindDuplicateNumber {

    static int findDuplicate(int[] nums) {

        // Step 1: Slow and Fast pointer
        int slow = nums[0];
        int fast = nums[0];

        // Step 2: Find the meeting point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];

        } while (slow != fast);


        // Step 3: Reset slow to starting point
        slow = nums[0];

        // Step 4: Find the entrance of the cycle
        while (slow != fast) {

            slow = nums[slow];
            fast = nums[fast];
        }

        // Duplicate number
        return slow;
    }


    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2};

        int result = findDuplicate(nums);

        System.out.println(result);
    }
}