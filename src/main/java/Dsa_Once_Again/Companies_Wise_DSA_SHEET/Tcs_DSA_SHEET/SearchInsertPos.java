class SearchInsertPos {
	static int seachinsert(int[] arr, int target)
	{
		int start=0;
		 int end=arr.length-1;
		while(start<end)
		{
			int mid= start+(end-start)/2;
			//Let' see
			if(arr[mid]>=target)
			{
				return arr[mid];
			}
			else {
				start= mid+1;
			}
			
		}
		return arr.length;
	}
	public static void main(String[] args)
	{
		int[] arr ={1,3,5,6};
		int result= seachinsert(arr,7);
		System.out.println(result);
	}
}