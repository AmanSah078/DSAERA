class SearchInsertPostion {
	static int tosearchinsertiPos(int[] arr, int target)
	{
		int start=0;
		int end= arr.length-1;
		while(start<end)
		{
			int mid= start+(end-start)/2;
			
			//case:1 
			if(arr[mid]>=target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				start= mid+1;
			}
		}
		return arr.length;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,3,5,6};
		int result= tosearchinsertiPos(arr,7);
		System.out.println(result);
	}
}