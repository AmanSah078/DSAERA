class Sum_Of_Array {
	static void totalsum(int[] arr)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		//int[] arr={1,2,3};
		int[] arr={15, 12, 13, 10};
		totalsum(arr);
	}
}