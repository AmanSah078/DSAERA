class Lower_Bound {
	static int findthelowerbound(int[] arr, int target)
	{
	int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid= start+(end-start)/2;
			//base condition
			if(target>arr[arr.length-1])
			{
			return arr.length;
			}
			
			//In this time we should never return anything we have to first check in the left side
			if(target<=arr[mid])
			{
				end=mid;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
				
			}
		return start;
		}
	
	public static void main(String[] args)
	{
	int[] arr= {2, 3, 7, 10, 11, 11, 25};
	int result=findthelowerbound(arr,11);
    System.out.println(result);
	}
}
