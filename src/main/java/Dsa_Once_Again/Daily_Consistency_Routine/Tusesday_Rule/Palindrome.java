class Palindrome {
	static void findthepalindrome(int n)
	{
		int org= n;
		int rev=0;
		while(n>0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(org==rev)
		{
			System.out.println("Yes Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	public static void main(String[] args)
	{
//		  int n=121;
		int n=123;
	     findthepalindrome(n);
		
	}
}