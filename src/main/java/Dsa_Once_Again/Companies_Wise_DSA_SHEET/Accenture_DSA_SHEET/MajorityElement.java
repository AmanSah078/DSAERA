class MajorityElement {
	static int majority(int[] arr)
	{
		int majority= arr[0];
		int votes=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(votes==0)
			{
				majority= arr[i];
				votes++;
			}
			else if(majority==arr[i])
			{
				majority=arr[i];
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
		//int[] arr= {3,2,3};
		int[] arr= {2,2,1,1,1,2,2};
		int result= majority(arr);
		System.out.println(result);
	}
}