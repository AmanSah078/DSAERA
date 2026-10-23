class Gcd {
	static int tofindgcd(int a, int b)
	{
		while(b!=0)
		{
			int rem= a%b;
			a=b;
			b=rem;
		}
		return a;
	}
	public static void main(String[] args)
	{
	
		//int result= tofindgcd(28,8);
		int result= tofindgcd(60,36);
		System.out.println(result);
	}
}