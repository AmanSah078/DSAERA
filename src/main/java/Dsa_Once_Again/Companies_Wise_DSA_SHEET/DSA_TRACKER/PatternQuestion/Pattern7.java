class Pattern7 {
	static void topattern(int n)
	{
		int space= n/2;
		int star=1;
		
		for(int row=1; row<=n; row++)  //->Common loop this is bhai
		{
			//Phle jitna baar aaya hain utna baar u have to print dost
			for(int j=1; j<=space; j++)
			{
				System.out.print("\t");
			}
			
			//Now ab star print krna hain
			for(int st=1; st<=star; st++)
			{
				System.out.print("*\t");
			}
			//Now apply condition
			if(row<=n/2)
			{
				space--;
				star= star+2;
			}
			else {
				space++;
				star= star-2;
			}
			//space
			System.out.println();
		}
	}
	public static void main(String[] arsg)
	{
		 topattern(5);
	}
}