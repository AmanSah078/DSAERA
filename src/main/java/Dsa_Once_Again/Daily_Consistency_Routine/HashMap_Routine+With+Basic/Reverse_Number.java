class Reverse_Number {
	static void reversenum(int n)
	{
		int rev=0;
		while(n>0)
		{
			int digit=n%10;
		    rev=rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args)
		
	{
		//int n=1234;
		int n=907;
		reversenum(n);
	}
}