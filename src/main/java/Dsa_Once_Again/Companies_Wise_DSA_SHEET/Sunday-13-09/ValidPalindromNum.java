class ValidPalindromNum {
	static boolean isvalidpalindrome(int[] arr)
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]!=arr[j])
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args)
	{
		//int[] arr=  {1,2,1};
		int[] arr=  {2,5,4,8};
		boolean result= isvalidpalindrome(arr);
		System.out.println(result);
	}
}