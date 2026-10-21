class Check_Array_Is_Sorted_Or_Not {
	static void checkthearraysortornot(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]>arr[i+1])
			{
				System.out.println("array is not sorted");
				return;
			}
		}

			System.out.println("array is sorted");
		}
		
		
		
	
	public static void main(String[] args)
	{
		int[] arr={5,4,6,8,1};
		checkthearraysortornot(arr);
	}
}