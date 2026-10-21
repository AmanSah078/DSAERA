class Majority_Element {
	static void findthemajorityelement(int[] arr)
	{
		int votes=0;
		int majority=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			//case:1
			if(votes==0)
			{
				votes++;
			}
			//case:2
			else if(arr[i]==majority)
			{
				majority=arr[i];
				votes++;
			}
			else  {
				votes=0;
			}
		}
		System.out.println(majority);
	}
	public static void main(String[] args)
	{
		//int[] arr={3,2,3};
		int[] arr={1};
		findthemajorityelement(arr);
	}
}