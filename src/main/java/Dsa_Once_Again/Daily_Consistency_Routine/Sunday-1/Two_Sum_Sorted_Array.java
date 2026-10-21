class Two_Sum_Sorted_Array {
	static void twosum(int[] arr, int target)
	{
		int i=0; 
		int j=arr.length-1;
		int sum=0;
		while(i<j)
		{
			sum=arr[i]+arr[j];
			if(sum==target)
			{
				System.out.println(i+ " " +j);
			}
			if(sum>target)
			{
				j--;
			}
			else {
				i++;
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr ={2,3,7,9,11};
		twosum(arr,9);
		
	}
}