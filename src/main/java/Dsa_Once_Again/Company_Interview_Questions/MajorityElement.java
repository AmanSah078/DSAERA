class MajorityElement{
	static int MajorityElement(int[] arr)
	{
		int majority= arr[0];
		int votes=0;
		
		for(int i=0; i<arr.length; i++)
			
		{
			//case:1 
			if(votes==0)
			{
				majority=arr[i];
				votes++;
			}
			//case:2
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
		int[] arr= {2, 2, 1, 1, 1, 2, 2};
		int result= MajorityElement(arr);
		System.out.println(result);
	}
}