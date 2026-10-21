class CountPrime {
	public static void main(String[] args)
	{
		int n=11;
//		int num=2;
		int count=0;
		//Outer loop 
		for(int num=2; num<=n; num++)
		{
			boolean isPrime=true;
			
			//If true then go to the Inner loop
			for(int i=2; i*i<=num; i++)
			
			{
				if(num%i==0)
				{
					isPrime= false;
					break;
				}
			}
				if(isPrime)
				{
					count++;
				}
		}
	System.out.println(count);
	
		
	}
}