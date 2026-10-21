class PrimeNum {
	static boolean toprime(int n)
	{
		for(int i=2; i*i<=n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		boolean result= toprime(6);
		System.out.println(result);
	}
}