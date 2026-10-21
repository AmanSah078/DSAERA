class Pattern9 {
	static void topattern9(int n)
	{
		int spaceback=0;
		int star=1;
		int spacefr= n/2+2;
		
		//Basic Lopp
		for(int row=0; row<=n; row++)
		{
		//First Outer loop
	    for(int sp=0; sp<=spaceback; sp++)
		{
			//print
			System.out.print("\t");
		}
	    //For the star
		for(int st=1; st<=star; st++)
		{
			System.out.print("*\t");
		}
		//for the spacefront
		for(int spb=1; spb<=spacefr; spb++)
		{
			System.out.println("\t");
			
		}
			if(row<=n/2+2)
			{
				spaceback++;
				spacefr--;
			}
			else {
				spaceback=spaceback+2;
				spacefr=spacefr-2;
			}
		System.out.println();
		}
	}
	public static void main(String[] arsg)
	{
		 topattern9(5);
	}
	
}