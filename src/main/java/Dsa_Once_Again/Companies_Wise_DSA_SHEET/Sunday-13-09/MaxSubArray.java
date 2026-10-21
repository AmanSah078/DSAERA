class MaxSubArray {
	static int tofindmaxsubarray(int[] arr)
	{
		int currsum= 0;
		int maxsum=0;
		for(int i=0; i<arr.length; i++)
		{
		if(currsum==0 || currsum<0)
		{
			currsum= arr[i];
		}
	    else{
			currsum= currsum+arr[i];
		}
			if(currsum>maxsum)
			{
				maxsum=currsum;
			}
	}
		return maxsum;

	}
	public static void main(String[] args)
	{
		//int[] arr = {5,4,-1,7,8};
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int result= tofindmaxsubarray(arr);
		System.out.println(result);
	}
}