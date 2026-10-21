class Dutch_Flag_Algorithm {
	//This method i am going to use to find the swap
	static void swap(int[] arr, int low, int high)
	{
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]= temp;
	}
	//now its time to show the test case Through the Three pointer
	static void findthedutch(int[] arr)
	{
	while(mid<=end)
	{
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		//case:
		if(arr[mid]=0)
		{
			swap(arr,low,mid);
			low++;
			mid++;
		}
		//case:2
		else if(arr[mid]==1)
		{
			mid++;
		}
		//case:3
	 
		else {
			else(arr,mid,high);
			high--;
		}
	}
	}
}