class FibonacciNumber{
	static int fibonumber(int n)
	{
		int a=0;
		int b=1;
		int store=0;
		for(int i=2; i<=n; i++)
		{
			int c=a+b;
			a=b;
			b=c;
			store=c;
		}
		return store;
	}
	public static void main(String[] args)
	{
		//int n=3;
		int n=4;
		int result= fibonumber(n);
		System.out.println(result);
	}
}