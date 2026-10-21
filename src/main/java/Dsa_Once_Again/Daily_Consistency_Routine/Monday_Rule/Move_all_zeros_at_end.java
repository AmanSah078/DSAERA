class Move_all_zeros_at_end {
	static void Move_all_zeros_at_end(int[] arr)
	{
		//take loop
		int store=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[store]=arr[i];
				store++;
			}
		}
		//now use the while loop
		while(store<arr.length)
		{
			arr[store]=0;
			store++;         
		}
	}
	public static void main(String[] args)
	{
		int[] arr={0,1,0,3,12};
		Move_all_zeros_at_end(arr);
		//One more loop to print
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}