class Pattern3{
	static void topattern3(int n)
	{
		//outer loop->row
		for(int row=1; row<=n; row++)
		{
	   //inner loop->col yani kitna baar aaya hain
		for(int col=n; col>=row; col--)
		{
			System.out.print("*");
		}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		topattern3(5);
	}
}