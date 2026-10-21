class Factroial {
	static int tofact(int n)
	{
		//case:2 when u want to stop
		
		if(n==1)
		{
			return 1;
		}
		
		//case:3 Now to break the Prob
		return n*tofact(n-1);
		
		
	}
	public static void main(String[] args)
	{
		//u want to start from where?
		int result= t+3+ofact(5);
		System.out.println(result);
	}
}