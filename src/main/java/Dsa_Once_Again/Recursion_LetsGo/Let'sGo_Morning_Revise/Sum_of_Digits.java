class Sum_of_Digits {
	//create function dude
	static int sumofdigitss(int n)
	{
		//Let's stop
		if(n==0)
		{
			return 0;
		}
		//what u want to do with the function
		return (n%10)+sumofdigitss(n/10);
	}
	//main  
	public static void main(String[] args)
	{
	 //  int result=sumofdigitss(1342);
		int result=sumofdigitss(687);
		System.out.println(result);
	}
}