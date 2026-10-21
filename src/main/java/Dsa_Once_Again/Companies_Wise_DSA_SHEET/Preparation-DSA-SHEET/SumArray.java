class SumArray {
	static int sumofarray(int[] arr)
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
		int[] arr ={2,4,6,8};
		int result= sumofarray(arr);
		System.out.println(result);
	}
}