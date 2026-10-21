class MaxSubArrayy {
	static int tofindmax(int[] arr)
	{
		int maxsum= arr[0];
	    int currsum=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(currsum<0)
			{
				currsum= arr[i];
				
			}
			else {
				currsum= currsum+arr[i];
			}
			if(currsum>maxsum)
			{
				maxsum= currsum;
			}
		}
		
		return maxsum;
	}
}