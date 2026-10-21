class Count_Even_odd {
	static void countevenodd(int[] arr)
	{
	int even=0;
	int odd=0;
		for(int i=0; i<arr.length; i++)
		{
		if(arr[i]%2==0)
		{
			even++;
		}
		else 
		{
	odd++;
	}
		}
		System.out.println(even + " " + odd);
	}
	public static void main(String[] args)
	{
		int[] arr= {2,3,4,5,6};
		countevenodd(arr);
	}
}