class SumOfDigits {
	static int tosumdigit(int n)
	{
		//base case
		if(n==0)
		{
			return 0;
		}
		//Now to do somehting with the recurison
		return n%10+tosumdigit(n/10);
	}
	public static void main(String[] args)
	{
		int result= tosumdigit(1234);
		System.out.println(result);
		
	}
}