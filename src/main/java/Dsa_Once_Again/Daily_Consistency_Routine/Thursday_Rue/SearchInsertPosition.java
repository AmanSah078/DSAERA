class SearchInsertPosition {
	static int tomaintainpositon(int[] arr, int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target>=arr[mid])
			{
				return mid;
			}
			else  {
				end= mid-1;
			}
		}
		return start;
		
	}
	public static void main(String[] args)
	{
		//int[] arr={1,3,5,6};
		int[] arr={1,3,5,6};
		//int result=tomaintainpositon(arr,5);
		//int result=tomaintainpositon(arr,2);
	    	int result=tomaintainpositon(arr,7);
		System.out.println(result);
	}
}