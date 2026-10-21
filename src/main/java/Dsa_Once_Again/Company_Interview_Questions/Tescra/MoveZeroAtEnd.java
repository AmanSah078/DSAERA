class MoveZeroAtEnd {
	static void tomovezeroatend(int[] arr)
	{
		int store=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[store]= arr[i];
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
			System.out.println(arr[i]+  " ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,5,4,0,3,0};
		tomovezeroatend(arr);
	}
}