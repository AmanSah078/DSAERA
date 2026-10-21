class FibonacciNum {
	static int fibonum(int n)
	{
		int a=0; 
		int b=1;
		int count=0;
		for(int i=2; i<=n; i++)
		{
			int c=a+b;
			count++;
			a=b;
			b=c;
		}
		return count;
	}
	public static void main(String[] args)
	{
		int n= 3;
		int result= fibonum(n);
		System.out.println(result);
	}
}