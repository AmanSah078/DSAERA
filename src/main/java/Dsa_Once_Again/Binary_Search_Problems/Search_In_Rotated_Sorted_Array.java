public class SearchInRotatedSortedArray {

    // Method to find the pivot (largest element)
    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // Find middle element
            int mid = start + (end - start) / 2;

            // ==========================
            // CASE 1
            // Check if mid itself is the pivot
            // Example:
            // 4 5 6 7 0 1 2
            //       ^
            //      mid
            // 7 > 0 → Pivot = mid
            // ==========================
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // ==========================
            // CASE 2
            // Check if previous element is the pivot
            // Example:
            // 4 5 6 7 0 1 2
            //         ^
            //        mid
            // 0 < 7 → Pivot = mid - 1
            // ==========================
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // ==========================
            // CASE 3
            // Pivot lies on the left side
            //
            // Example:
            // 6 7 8 9 1 2 3
            // start      mid
            //
            // arr[mid] < arr[start]
            // So move left
            // ==========================
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            }

            // ==========================
            // CASE 4
            // Otherwise pivot lies on the right side
            // ==========================
            else {
                start = mid + 1;
            }
        }

        // Array is not rotated
        return -1;
    }
	//One more method for the Target where we need to do the simple binary search
	
	static int binarysearch(int[] arr,int target, int start, int end)
	{
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target)
				
			{
				return mid;
			}
			else if(arr[mid]>target)
			{
				end=mid-1;
			}
			else {
				start=mid+1
			}
		}
		return -1;
	}
	//One More method for the to call the both of the method 
	
	static int search(int[] arr, int target)
	{
	int pivot=findPivot(arr);
		
	//yadi pivot==-1
		if(pivot==-1)
		{
			return binarysearch(arr,target,0,arr.length-1);
		}
	//yadi pivot hi target ho to
		if(arr[pivot]==target)
		{
			return pivot;
		}
	//if target is greater than and equal to first eleemnt
		if(target>=arr[0])
		{
			return binarysearch(arr,target,0,pivot-1);
		}
	//otherwise
		return binarysearch(arr,target,pivot+1,arr.length-1);
	}

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int pivot = findPivot(arr);

        System.out.println("Pivot Index = " + pivot);
        System.out.println("Pivot Element = " + arr[pivot]);
		
		
		
    }
}