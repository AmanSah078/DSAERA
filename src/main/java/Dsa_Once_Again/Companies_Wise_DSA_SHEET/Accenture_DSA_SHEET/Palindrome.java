class Palindrome {
	
	public static void main(String[] args)
	{
		int n=781;
		int temp= n;
		int rev=0;
		while(temp!=0)
		{
			int digit= temp%10;
			rev=rev*10+digit;
			temp= temp/10;
				
			
		}
		if(rev==n)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
	}

}