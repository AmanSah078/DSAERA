class SumOfArray {
	static int tosumofArray(int[] arr)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args)

	{
		int[] arr= {2,4,6,8,10};
		int result= tosumofArray(arr);
		System.out.println(result);
	}
}