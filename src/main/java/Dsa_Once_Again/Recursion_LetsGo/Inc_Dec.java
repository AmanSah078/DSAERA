class Inc_Dec {
	static void both(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return;
		}
		System.out.println(n);
		//what u want to do with func
		both(n-1);
	}
	//now to decr function
	static void rev(int n)
	{
		//base case
		if(n==5)
		{
			System.out.println(n);
			return;
		}
		System.out.println(n);
		rev(n+1);
	}
	public static void main(String[] args)
	{
		both(5);
		rev(1);
	}
}