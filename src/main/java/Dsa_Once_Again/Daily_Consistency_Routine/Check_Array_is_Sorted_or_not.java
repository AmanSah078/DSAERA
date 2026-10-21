class Check_Array_is_Sorted_or_not {
	static boolean check(int[] arr)
	{
		for(int i=0; i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				return false;
			}
			
		}
		return true;
	}
		
		
		
	
	
	public static void main(String[] args)
	{
		//int[] arr={1,2,3,4,5};
		int[] arr={1,3,2,4,5};
		boolean result=check(arr);
		System.out.println(result);
	}
	
}