  import java.util.Arrays;

class TwoSum {

    static int[] findthetwosum(int[] arr, int target)
    {
        int i = 0;
        int j = arr.length - 1;

        while(i < j)
        {
            int sum = arr[i] + arr[j];

            // Case 1: target found
            if(sum == target)
            {
                return new int[]{i, j};
            }

            // Case 2: sum is too large
            else if(sum > target)
            {
                j--;
            }

            // Case 3: sum is too small
            else
            {
                i++;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 7, 11, 15};

        int[] result = findthetwosum(arr, 9);

        System.out.println(Arrays.toString(result));
    }
}