class Pattern2 {
	static void pattern2(int n)
	{
		//outer loop
		for(int row=1; row<=n; row++)
		{
		//inner loop
	    for(int col=1; col<=n; col++)
		{
			//kya print karana hain 
			System.out.print("*");
		}
		    //Next Line
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		pattern2(5);
	}
}