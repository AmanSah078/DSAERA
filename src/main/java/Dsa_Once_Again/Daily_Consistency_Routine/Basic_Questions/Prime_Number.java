class Prime_Number {
	static boolean isPrime(int n)
	{
		//edge case
		//intially 
		if(n<=1)
		{
			return false;
		}
		
		for(int i=2; i*i<n; i++) //yaha dekh bhai 4<2 false ho gya na smjha
		{ 
			if(n%i==0) //7%2==0 no 
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		int n=13;
		boolean result=isPrime(n);
		System.out.println(result);
	}
}