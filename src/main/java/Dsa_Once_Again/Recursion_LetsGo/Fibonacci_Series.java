class Fibonacci_Series
{
	//creaet funciton
	static int fibo(int n)
{
	//2.Base Conditon
	if(n<2)
	{
		return n;
	}
	
	//1.st
	return fibo(n-1)+fibo(n-2);
}
	public static void main(String[] args)
	{
	int result= fibo(5);
		System.out.println(result);
	}
}
