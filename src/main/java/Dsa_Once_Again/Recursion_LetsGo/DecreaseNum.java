class DecreaseNum {
	static  void decreasethenum(int n)
	{
		//base case:
		if(n==1)
			
		{
			System.out.println(n);
			return;
		}
		System.out.println(n);
	//function want to dec number one by one
		decreasethenum(n-1);
	}
	public static void main(String[] args)
	{
		decreasethenum(5);
		
	}
}