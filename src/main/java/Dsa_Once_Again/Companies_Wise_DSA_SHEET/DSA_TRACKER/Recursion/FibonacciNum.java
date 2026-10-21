class FibonacciNum   
{
	static int fib(int n)
	{
		//case:2 when u want to stop?
		if(n<=1)
		{
			return n;
		}
		//Need to call before the function call 
		System.out.println(n);
		//case:3 Let's break the problem i mean what we doing with the funciton that will called the recursive call
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args)
	{
	//case:1 u start from where
	
	int result= fib(4);
	System.out.println(result);
}
}