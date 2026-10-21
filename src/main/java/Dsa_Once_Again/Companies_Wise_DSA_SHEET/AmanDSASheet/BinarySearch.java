class PrimeNum {
	public static void main(String[] args)
	{
		int n=4;
		for(int i=2; i*i<=n; i++)
		{
			if ((n % i) == 0)
			{
				System.out.println("Not Prime Num");
			}
			else {
				System.out.println("Yeah Prime Num");
			}
		}
	}
}