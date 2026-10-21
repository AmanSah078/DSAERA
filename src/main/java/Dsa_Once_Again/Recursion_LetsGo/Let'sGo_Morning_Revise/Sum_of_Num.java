class Sum_of_Num {
	static int sumofnumber(int n)
	{
		//Lets stop
		if(n==0)
		{
			return 0;
		}
		//Let's goo what u want to do with function
		return n+sumofnumber(n-1);
	}
	public static void main(String[] args)
	{
int ans=sumofnumber(5);
System.out.println(ans);
		
	}
}