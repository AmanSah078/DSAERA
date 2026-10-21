class Prime_Number {
	static void findtheprimenum(int n)
	{
		for(int div=2; div*div<n; div++)
		{
			if(n%div==0)
				
			{
				System.out.println("not primenumber");
				break;
			}
			else {
				System.out.println("PrimeNum");
				break;
			}
		}
	}
	public static void main(String[] args)
	{
		findtheprimenum(17);
	}
}