class PeakElement {
	static int findthepeak(int[]arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			
			//1st check is it in the form in increasing format
			if(arr[mid]<arr[mid+1])
			{
				start=mid+1;
			}
			//Now check is it in the form in decresing format
			else if(arr[mid]>arr[mid+1])
			{
				end = mid;
			}
		}
		return start;
	}
		public static void main(String[] args)
		{
//			int[]arr= {1, 2, 4, 5, 7, 8, 3};
			 int[] arr={10, 20, 15, 2, 23, 90, 80};
			int result= findthepeak(arr);
			System.out.println(result);
			
		}
}