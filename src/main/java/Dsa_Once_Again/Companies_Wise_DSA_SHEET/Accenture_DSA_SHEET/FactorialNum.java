class FactorialNum {
	static int tofact(int n)
	{
		//base case
		if(n==0 || n==1)
		{
			return 1;

		}
		return n*tofact(n-1);
	}
	public static void main(String[] args)
	{
		System.out.println(tofact(5));
		
	}
}