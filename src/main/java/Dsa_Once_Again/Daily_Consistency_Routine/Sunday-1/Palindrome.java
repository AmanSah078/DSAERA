class Palindrome {
	static String findpalindrome(int[] arr)
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]==arr[j])
			{
				return "Yes Palindrome";
			}
			i++;
			j--;
		}
		return "Not Palindrome";
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,4,1};
		String result= findpalindrome(arr);
		System.out.println(result);
	}
}