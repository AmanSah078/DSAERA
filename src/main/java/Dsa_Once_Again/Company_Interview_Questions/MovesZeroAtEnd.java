class MovesZeroAtEnd {
	static void atendzero(int[] arr)
	{
	 int store=0;
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]!=0)
		{
			arr[store]=arr[i];
			store++;
		}
	}
		while(store<arr.length)
			
		{
			arr[store]=0;
			store++;
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr=  {0, 1, 0, 3, 12};
		atendzero(arr);
	}
}