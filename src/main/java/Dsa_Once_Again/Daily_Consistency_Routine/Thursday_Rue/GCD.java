class GCD {
	static int greatescommondivisior(int a, int b)
	{
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
	
	return a;
	}
	public static void main(String[] args)
	{
		int a=12;
		int b=18;
		int result=greatescommondivisior(12,18);
		System.out.println(result);
	}
}