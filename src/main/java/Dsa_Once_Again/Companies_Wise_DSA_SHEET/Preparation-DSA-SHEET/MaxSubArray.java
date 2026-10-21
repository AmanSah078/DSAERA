class MaxSubArray{
	static int maxsubbarray(int[] arr)
	{
		int currsum=0;
		int max=0;
		for(int i=0; i<arr.length; i++)
		{
			if(currsum>0)
			{
				currsum=currsum+arr[i];
			}
			else {
				currsum= arr[i];
			}
			if(max<currsum)
			{
				max= currsum;
			}
			
		}
		return max;

	}
	public static void main(String[] args)
	{
		int[] arr = {5,4,-1,7,8};
		int result=  maxsubbarray(arr);
		System.out.println(result);
		
	}
}