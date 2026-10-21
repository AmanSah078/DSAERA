class factorialNum{
	static int findfact(int n)
	{
		//base case
		if(n==0)
		{
			return 1;
		}
	//what u want with func
		//System.out.pritntln(n);
		
//		System.out.println(n);
	    return n*findfact(n-1);
	
		
	}
	//main
	public static void main(String[]args)
	{
		System.out.println(findfact(5));
	}
}