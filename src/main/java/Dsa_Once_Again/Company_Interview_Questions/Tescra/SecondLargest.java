class SecondLargest{
	static void tofindsecondlargest(int[] arr)
	{
		int max= arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
				
			{
				max= arr[i];
			}
		}
	int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(max>arr[i] && secondLargest<arr[i])
			{
				secondLargest= arr[i];
			}
		}
		System.out.println(secondLargest);
	}
	public static void main(String[] args)
	{
		int[] arr= {10, 10, 5};
		tofindsecondlargest(arr);
	}
}