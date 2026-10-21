class Sum_Of_Digits {
	static void findthesumofdigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			//digits=0;
			int digits= n%10;
			sum=sum+digits;
			n=n/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		
		//findthesumofdigits(687);
			findthesumofdigits(21);
	}
}