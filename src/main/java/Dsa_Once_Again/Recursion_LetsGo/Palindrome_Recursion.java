class Palindrome_Recursion {
static boolean ispalindrome(int[] arr, int start, int end)
{
	//case:1
	//when not palindrome
	if(start>=end)
	{
		return true;
	}
	//case:2
	//when not palindrome
	if(arr[start]!=arr[end])
	{
		return false;
	}
	//case:3
	//To update the start and end
	return ispalindrome(arr,start+1,end-1);
}
	public static void main(String[] args)
	{
		int[]arr= {1,2,3,2,1,5};
		 boolean result=ispalindrome(arr,0,arr.length-1);
	     System.out.println(result);
	}
}