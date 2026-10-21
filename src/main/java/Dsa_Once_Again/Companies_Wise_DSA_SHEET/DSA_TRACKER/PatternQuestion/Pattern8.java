class Pattern8 {
	static void topattern(int n)
	{
		int star= n/2+1;
		int space=1;
		
		//Basic Loop
		for(int row=1; row<=n; row++)
		{
		//Now First loop for the star
			for(int st=1; st<=star; st++)
			{
				System.out.print("*\t");
			}
		//Now this is for the space
			for(int sp=1; sp<=space; sp++)
			{
				System.out.print("\t");
			}
		//Again one loop for the star
			for(int st=1; st<=star; st++)
			{
				System.out.print("*\t");
			}
			if(row<=n/2)
			{
				star--;
				space=space+2;
			}
			else {
				star++;
				space=space-2;
			}
			//Now Next Line
			System.out.println();
		}
	}
	public static void main(String[] arsg)
	{
		 topattern(5);
	}
}