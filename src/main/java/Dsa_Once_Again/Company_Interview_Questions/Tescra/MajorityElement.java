class MajorityElement {
	static int togetmajority(int[] arr)
	{
		int majority=arr[0];
		int votes=0;
		
		for(int i=0; i<arr.length; i++)
		{
			//case: 1
			if(votes==0)
			{
				majority= arr[i];
				votes++;
			}
			//case: 2
			else if(majority==arr[i])
			{
				majority=arr[i];
				votes++;
			}
			//case: 3
			else {
				votes--;
			}
		}
		return majority;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,2,3};
		int result= togetmajority(arr);
		System.out.println(result);
	}
}