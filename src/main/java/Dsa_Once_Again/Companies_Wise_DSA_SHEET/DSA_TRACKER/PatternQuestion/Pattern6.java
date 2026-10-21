class Pattern6 {
	static void topattern6(int n)
	{
		//outer loop->row
		for(int row=1; row<=n; row++)
		{
			//innner loop->col
			for(int col=1; col<=n-row; col++)
			{
			
				System.out.print(" ");
			}
			//Then star hain
			for(int col=1; col<=row; col++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
		public static void main(String[] args)
	{
		topattern6(5);
	}
	public static void main(String[] arsg)
	{
		 topattern(5);
	}
}