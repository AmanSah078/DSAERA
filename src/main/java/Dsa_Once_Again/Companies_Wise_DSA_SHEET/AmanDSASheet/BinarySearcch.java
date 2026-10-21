class BinarySearcch {
	static int tobinarysearch(int[] arr, int target)
	{
		int start=0;
		int end= arr.length-1;
		
		while(start<end)
		{
			int mid= start+(end-start)/2;
			
			//case:1 
			if(arr[mid]<target)
			{
				start= mid+1;
			}
			//case:2
			else if(arr[mid]>target)
			{
				end=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr= {2, 3, 4, 10, 40};
		int result= tobinarysearch(arr,10);
		System.out.println(result);
	}
}