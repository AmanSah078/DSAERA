class MajorityElement {
	static int majoritytimeselement(int[] arr)
	{
		int votes=0;
		int majority=arr[0];
		for(int i=0; i<arr.length; i++)
		{
		//case:1
		if(votes==0)
		{
			majority= arr[i];
			votes++;
		}
			else if(majority==arr[i])
			{
				majority= arr[i];
				votes++;
			}
			else {
				votes--;
			}
	}
		return majority;
}
	public static void main(String[] args)
	{
		int[] arr= {3,2,3};
		int result= majoritytimeselement(arr);
		System.out.println(result);
	}
}