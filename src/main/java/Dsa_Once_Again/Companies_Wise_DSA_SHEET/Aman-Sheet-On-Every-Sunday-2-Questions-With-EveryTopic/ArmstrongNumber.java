class ArmstrongNumber {
	static void isarmstrong(int num)
	{
		int temp = num;
		int sum=0;
		while(temp!=0)
		{
			int req = temp%10;
			int cube=(int)Math.pow(req,3);
			
			sum=sum+cube;
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
	public static void main(String[] args)
	{
		int num=185;
		isarmstrong(num);
	}
}