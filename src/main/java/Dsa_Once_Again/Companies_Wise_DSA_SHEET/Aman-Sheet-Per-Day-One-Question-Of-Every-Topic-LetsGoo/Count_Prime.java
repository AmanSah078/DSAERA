class Count_Prime {
	static int countprime(int n)
	{
		//This loop to for all 
		for(int num=2; num<=n; num++)
		{
			//Now chcek is it true or not i mean above condition is true or not let's goo
		boolean isprime=true;
			//So if outer loop true then plesae continue dude;
		//Now this inner loop is to verify the prime Number
			for(int i=2; i*i<=num; i++)
			{
				if(num%i==0)
				{
					isprime = false;
					break;
				}
			}
			if(isprime)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		int n=10;
		int result= countprime(10);
		System.out.println(result);
	}
}