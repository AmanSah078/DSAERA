class ArmStrongNum{
	public static void main(String[] args)
	{
		int n=153;
		int temp= n;
        int sum= 0;
		while(temp>0)
		{
			int digit= temp%10;
			int cube = (int) Math.pow(digit, 3);
			sum=sum+cube;
			temp= temp/10;
		}
		if(sum==n)
		{
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not ArmstrongNum");
		}
	}
}