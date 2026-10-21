class Majority_Element {
	static void findmajority(int[] arr)
	{
		int votes=0;
		int majority=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(votes==0)
			{
				votes++;
			}
			else if(arr[i]==majority)
			{
				majority=arr[i];
			}
			else  {
				votes--;
			}
		}
		System.out.println(majority);
	}
	public static void main(String[] args)
	{
		int[] arr ={3,2,3};
		findmajority(arr);
	}
}