class Sum_of_Array {
	static int tosum(int[] arr)
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
		int[] arr ={2,3,5,6,4};
		int result= tosum(arr);
		System.out.println(result);
	}
}