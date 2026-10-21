class IncreNum {
	static int toincreaseNum(int n)
	{
		if(n==5){
			return 5;
		}
		System.out.println(n);
		
		return toincreaseNum(n+1);
	}
	public static void main(String[] args)
	{
		int result= toincreaseNum(1);
		System.out.println(result);
	}
}