class MaxElement {
	static int maxelement(int[] arr)
	{
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max= arr[i];
			} 
		}
		return max;
	}
	public static void main(String[] args)
	{
		int[] arr={1,3,4,2,2};
		int result= maxelement(arr);
		System.out.println(result);
	}
} 