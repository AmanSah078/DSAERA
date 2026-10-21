class ArmStrongNum {
	static boolean isArmstrong(int n)
	{
		
		int temp=n;
		int sum=0;
		while(temp!=0)
		{
//		temp= temp%10;
//		int digit= (int)Math.pow(digit,3);
//			temp = temp % 10;
int digit= temp%10;
int cube= (int) Math.pow(digit, 3);
		sum=sum+cube;
		temp= temp/10;
	    }
		if(sum==n)
		{
			return true; 
		}
		return false; 
	public static void main(String[] args)
	{
		boolean result=  isArmstrong(153);
		System.out.println(result);
	}
	
}