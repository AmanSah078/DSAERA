class PalindromeArray {
	static boolean ispalindrome(int[] arr)
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
		//int[] arr ={1,2,1};
		int[] arr= {5,8,7,5,8};
		boolean result= ispalindrome(arr);
		System.out.println(result);
	}
}
