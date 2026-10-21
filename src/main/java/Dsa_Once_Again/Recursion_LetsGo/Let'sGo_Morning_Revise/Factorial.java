class Factorial {
	//create a fucniton 
	static int fact(int  n)
	{
		//when u want to stop dude
		if(n==0)
		{
			return 1;
		}
		//what u want to do with recursion so
		return n*fact(n-1);
	}
	public static void main(String[] args)
	{
		int result=fact(5);
		System.out.println(result);
	}
}