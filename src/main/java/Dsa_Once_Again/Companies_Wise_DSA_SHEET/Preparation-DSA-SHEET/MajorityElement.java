class MajorityElement {
	static int findmajority(int[] arr)
	{
		int votes=0;
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			//case:1
			if(votes==0)
			{
				max=arr[i];
				votes++;
			}
			//case:2
			else if(max==arr[i])
			{
				max=arr[i];
				votes++;
			}
			//case:3
			else {
				votes--;
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		//int[] arr= {3,2,3};
		int[] arr ={2,2,1,1,1,2,2};
		int result= findmajority(arr);
		System.out.println(result);
	}
}