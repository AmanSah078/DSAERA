class CountPrime {
	public static void main(String[] args)
	{
		int count=0;
		int n=10;
	//This loop for the verification
		for(int num=2; num<=n; num++)
		{
			//use boolan to check 1st loop is true na
			boolean isPrime= true;
			
			//iF true then we r going to the Actual Prime conditon
			for(int i=2; i*i<=num; i++)
			{
				if(num%i==0)
				{
					isPrime= false;
					break;
				}6
			}
			
		if(isPrime)
			{
				count++;
			}
		}
	System.out.println(count);
	}
}