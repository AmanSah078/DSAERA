class Check_Sorted_Array{
	static boolean checkthesorted(int [] arr)
	{
		for(int i=0; i<arr.length-1; i++)
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
		//int[] arr={10, 20, 30, 40, 50};
		int[] arr={90, 80, 100, 70, 40, 30};
		boolean result=checkthesorted(arr);
		System.out.println(result);
	}
}