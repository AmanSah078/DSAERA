class MaxSubArray {
	static int tomaxsubArray(int[] arr)
	{
		int currsum= arr[0];
		int maxsum=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(currsum<0)
			{
				currsum= arr[i];
			}
			else
			{
				currsum= currsum+arr[i];
			}
			if(currsum>maxsum)
			{
				maxsum= currsum;
			}
		}
		return maxsum;
	}
	public static void main(String[] args)
	{
	//	int[] arr= {5,4,-1,7,8};
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int result= tomaxsubArray(arr);
		System.out.println(result);
	}
}