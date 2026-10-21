class Next_Permutation
{
    static void findTheNextPer(int[] arr)
    {
        // Case 1: Find the Pivot
        int pivot = -1;

        for (int i = arr.length - 2; i >= 0; i--)
        {
            if (arr[i] < arr[i + 1])
            {
                pivot = i;
                break;
            }
        }

        // Case 2: Agar pivot nahi mila,
        // iska matlab current array last permutation hai.
        // Isliye pura array reverse kar do.
        if (pivot == -1)
        {
            reverse(arr, 0, arr.length - 1);
            return;
        }

        // Case 3: Right side me pivot se just greater element find karo
        int greaterIndex = findJustGreaterIndex(arr, pivot);

        // Case 4: Pivot aur just greater element ko swap karo
        swap(arr, pivot, greaterIndex);

        // Case 5: Pivot ke baad wale part ko reverse karo
        reverse(arr, pivot + 1, arr.length - 1);
    }

    // Right side me pivot se just greater element find karo
    public static int findJustGreaterIndex(int[] arr, int pivot)
    {
        for (int i = arr.length - 1; i > pivot; i--)
        {
            if (arr[i] > arr[pivot])
            {
                return i;
            }
        }

        return -1;
    }

    // Swap Method
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse Method
    public static void reverse(int[] arr, int start, int end)
    {
        while (start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}