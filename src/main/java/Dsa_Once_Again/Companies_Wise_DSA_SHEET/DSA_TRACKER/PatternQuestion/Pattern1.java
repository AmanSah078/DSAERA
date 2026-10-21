class Pattern1 {
	static void tofindpattern(int n)
	{
		//outer looop which reprsent the row
		for(int row=1; row<=n; row++)
		{
			//Now inner loop which reprsent the inner loop->col
			for(int col=1; col<=row; col++)
			{
				//Kya hain col 1 mein
				System.out.print("*");
			}
			//Then next line 
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		tofindpattern(4);
	}
}