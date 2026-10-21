class Missing_Number {
	static int  tofindmissingnum(int[] arr)
	{
		int index=0;
		for(int i=0;  i<arr.length; i++)
		{
			if(arr[i]+1!=arr[i+1])
			{
				return arr[i]+1;
			}
		}
		return 0;
	}
	public static void main(String[] args)
	{
		//int[] arr= {2,3,5,6,7};
		int[] arr= {1,2,3,5,6};
		int result=tofindmissingnum(arr);
		System.out.println(result);
	}
}