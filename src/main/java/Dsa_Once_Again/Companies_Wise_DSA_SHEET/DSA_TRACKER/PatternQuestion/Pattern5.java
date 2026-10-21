class Pattern5 {
	static void topattern5(int n)
	{
		//outerloop->row
		for(int row=1; row<=n; row++)
		{
		//inner loop->col
		for(int col=1; col<=row; col++)
		{
			System.out.print(col+ " ");
		}
		//next line
		System.out.println();
			
		}
	}
	public static void main(String[] args)
	{
		topattern5(5);
	}
}