class Fibonacci_Series
{
	static void findthefibonacci(int n)
	{
		//It's commond dude Mandatory
		int a=0;
		int b=1;
		System.out.print(a+  " "+b);
		for(int i=3; i<=n; i++)
		{
			int c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
	}
	public static void main(String[] args)
	{
		int n=5;
			findthefibonacci(n);
	}
}