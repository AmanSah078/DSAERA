class MaxSum {
	static int maxsum(int[] arr)
	{
		int curr=0;
		int maxsum=0;
		for(int i=0; i<arr.length; i++)
		{
			if(curr<0)
			{
				curr = arr[i];
			}
			else {
				curr= curr+arr[i];
			}
		}
          if(maxsum<curr)
           {
	maxsum=curr;
           }
		return maxsum;
	}
	public static void main(String[] args)
	{
		int[] arr = {5,4,-1,7,8};
		int result= maxsum(arr);
		System.out.println(result);
	}
}