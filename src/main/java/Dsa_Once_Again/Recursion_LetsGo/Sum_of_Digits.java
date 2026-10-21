class Sum_of_Digits {
	//create func
	static int sumofdigitss(int n)
	{
		//base case
		if(n==0)
		{
			return 0;
		}
		//what u want to do with func
		return(n%10)+sumofdigitss(n/10);
		//n=n/10;
	
	}
	//main
	public static void main(String[] args)
	{
		int ans=sumofdigitss(1342);
		System.out.println(ans);
	}
}