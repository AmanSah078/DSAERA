class DecreaseTheNum{
	//create one function
	static void todecreasenum(int n)
	{
		//base case
		if(n==1)
		{
			System.out.println(n);
			return;
		}
//what to want in the fucntion
		System.out.println(n);
		todecreasenum(n-1);
	}
	//main
	public static void main(String[] args)
	{
	todecreasenum(5);
	}
}