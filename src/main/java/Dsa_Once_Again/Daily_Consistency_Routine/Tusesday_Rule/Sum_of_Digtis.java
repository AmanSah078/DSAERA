//Input: n = 687
//Output: 21
//Explanation: The sum of its digits are: 6 + 8 + 7 = 21
//
//Input: n = 12
//Output: 3
//Explanation: The sum of its digits are: 1 + 2 = 3



class Sum_of_Digtis
{
	static void sumthedigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			int digits=n%10;
			sum=sum+digits;
			n=n/10;
					
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		int n=687;
		sumthedigits(n);
	}
}
