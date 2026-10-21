class DecreaseNum {
	static int toDecreaseNum(int n)
	{
		//Case:2//When u want to stop
		if(n==1)
		{
			return 1;
		}
		//u have to print the before the recursive call
		System.out.println(n);
		
		//Case:3//To break the Prob with the function
		return toDecreaseNum(n-1);
	}
	public static void main(String[] args)
	{
		//Case:1//You Start From where?
		int result=toDecreaseNum(5);
		System.out.println(result);
	}
}