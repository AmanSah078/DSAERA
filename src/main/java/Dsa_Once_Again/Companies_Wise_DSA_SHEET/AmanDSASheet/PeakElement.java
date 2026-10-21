class PeakElement {
	static int topeakElement(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			int mid = start+(end-start)/2;
			
			//case:1 
			if(arr[mid]<arr[mid+1])
			{
				start= mid+1;
			}
			//case:2
			else if(arr[mid]>arr[mid+1])
			{
				end= mid-1;
			}
		}
		return start;
	}
	public static void main(String[] args)
	{
		//int[] arr= {1,2,3,1};
		int[] arr= {1,2,1,3,5,6,4};
		int result= topeakElement(arr);
		System.out.println(result);
	}
}