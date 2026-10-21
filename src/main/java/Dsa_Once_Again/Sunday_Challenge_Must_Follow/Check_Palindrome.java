class Check_Palindrome {
	static void palindrome(int n)
	{
		int rev=0;
	    int org=n;
		while(n>0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}n
		if(rev==org)
		{
			System.out.println("Yes Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	public static void main(String[] args)
	{
		//int n=123;
		int n=121;
		palindrome(n);
		
		
	}
	
}