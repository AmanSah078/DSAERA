class IncreaseNum {

//calling the method itself
	//2.kb tk 
	static void incrnum(int n)
	{
		//3.band kr Base Conditon
		if(n==5)
		{
			System.out.println(n);
			return;
		}
		System.out.println(n);
		//calling the same method itself
		incrnum(n+1);
	}
	
	//1st main method
	public static void main(String[] args)
	{
		//1st kaha se 
		int n=1;
	    incrnum(1);
	}
}