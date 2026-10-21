class Pair_Sum_Sorted_Array {
	static boolean pairsum(int[]arr, int target)
	{
		int i=0;
		int j=arr.length-1;
		int sum=0;
		
		while(i<j)
		{
			sum=arr[i]+arr[j];
			if(sum==target)
			{
				return true;
			}
			else if(sum>target)
			{
				j--;
			}
			else  {
				i++;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		int[] arr={2,7,9,11,15};
		boolean result=pairsum(arr,50);
		System.out.println(result);
	}
}