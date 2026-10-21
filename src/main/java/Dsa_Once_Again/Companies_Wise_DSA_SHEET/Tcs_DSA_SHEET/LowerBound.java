class LowerBound {
	static int lower(int[] arr, int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid= start+(end-start)/2;
			
			//case:1
			if(arr[mid]>=target)
				
			{
				end=mid;
			}
			//case:2
			else {
				start=mid+1;
			}
		}
		return start;
	}
	public static void main(String[] args)
	{
		int[] arr= {2, 3, 7, 10, 11, 11, 25};
		int result= lower(arr,11);
		System.out.println(result);
	}
}