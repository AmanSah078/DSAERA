class Armstrong_Number {
	static void findthearmstrnum(int n)
	{
		int org=n;
	int sum=0;
		//n is not change dude
		while(n>0)
		{
			
			int digit=n%10;
			int result=(int) Math.pow(digit,3);
			sum=sum+result;
			n=n/10;
			
			
		}
		if(sum==org)
		{
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not Armstrong Number");
		}
	}
	public static void main(String[] args)
	{
		int n=183;
		findthearmstrnum(n);
	}
	
}