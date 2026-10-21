class FindMax_Min {
	static int findthemax(int[] arr)
	{
		int max=arr[0];
		
		//for the max
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
		
		
		//for the min
		static int findthemin(int[] arr)
		{
			int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
	
		return min;
	}
	public static void main(String[] args)
	{
		int[] arr ={4,3,5,6,8,10};
		int result=findthemax(arr);
		System.out.println(result);
		int result1=findthemin(arr);
		System.out.println(result1);
	}
}