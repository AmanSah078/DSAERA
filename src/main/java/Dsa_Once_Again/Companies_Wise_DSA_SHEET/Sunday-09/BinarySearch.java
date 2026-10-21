class BinarySearch {
	static int binarysrch(int[]arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		//int mid=start+(end-start)/2;
		
		while(start<end)
		{
		int mid=start+(end-start)/2;
		
			//case:1
		if(target>arr[mid])
		{
			start= mid+1;
		}
			else if(target<arr[mid])
			{
				end= mid-1;
			}
			else {
				return arr[mid];
		}
		
	}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr ={-1,0,3,5,9,12};
		//int result = binarysrch(arr,9);
		int result = binarysrch(arr,2);
		System.out.println(result);
	}
}