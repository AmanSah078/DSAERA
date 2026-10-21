class ReverseNum {
	public static void main(String[] args)
	{
		int n=356;
		int temp= n;
		int rev=0;\
		while(temp!=0)
		{
			int digit= temp%10;
			rev= rev*10+digit;
			temp= temp/10;
		}
		System.out.println(rev);
		
	}
}