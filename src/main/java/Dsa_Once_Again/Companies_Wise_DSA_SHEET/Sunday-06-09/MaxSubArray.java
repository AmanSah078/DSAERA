class MaxSubArray {
	static int maxsubarray(int[] arr)
	{
		int currsum=0;
		int maxsum=0;
	for(int i=0; i<arr.length; i++)
	{
		if(currsum>0)
		{
		
			currsum= currsum+arr[i];
		}
		else {
				currsum=arr[i];
		}
	//Every time u have to keep na dude
		if(currsum>maxsum)
		{
			maxsum=currsum;
		}
	}
		return maxsum;
	}
	public static void main(String[] args)
	{
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int result= maxsubarray(arr);
		System.out.println(result);
	}
}
