class ReverseNum {
	static void toreversenum(int n, int rev)
	{
		//base condition
		//int rev=0;
		if(n==0)
		{
			 return rev;
		}
		int digit= n%10;
		return toreversenum(n/10, rev*10+digit);
	}
	public static void main(String[] args)
	{
		toreversenum(1824,rev);
		
	}
	
}