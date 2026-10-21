class Binary_Search {
	static int search(int[] arr, int target, int s, int e)
	{
		// u cannot keep the start and end inside the function ->bcz of reset
		//Base case
		if(s>e)
		{
			return -1;
		}
		//find mid
		int m=s+(e-s)/2;
		if(arr[m]==target)
		{
			return arr[m];
		}
		if(target>arr[m])
		{
			//call the  function
			return search(arr,target,m+1,e);
		}
		return search(arr,target,s,m-1);
		
		
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,55,66,78};
		int target=4;
		int result= search(arr,target,0,arr.length-1);
		System.out.println(result);
	}
}