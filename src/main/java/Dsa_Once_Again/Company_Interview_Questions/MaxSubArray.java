class MaxSubArray {
	static int maxsubarray(int[] arr)
	{
		int curr=0;
		for(int i=0; i<arr.length; i++)
		{
			if(curr<0)
			{
//			curr=curr+arr[i];
				curr=arr[i];
			}
			else {
				curr=curr+arr[i];
			}
		}
	return curr;
	}
	public static void main(String[] args)
	{
		//int[] arr= {5, 4, -1, 7, 8};
		//int[] arr= {-3, -2, -1, -5};
		int[] arr= {-2, 1, 3, -1, 2};
		int result= maxsubarray(arr);
		System.out.println(result);
	}
}