class Dutch_Flag_Algorithm {
	//1st-> To create the swap
	static void swap(int[] arr, int start, int end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	//2nd->Need create the method to sovle the problem
	static void findthedutch(int[] arr)
	{
    //3nd->To Take the 3 pointer
		int low=0;
		int mid=0;
		int high=arr.length-1;
	//Note: U should only care about the mid dont need to worry about the remaing var	
		while(mid<=high)
		{
			//case:1
			if(arr[mid]==0)
			{
				//need of swap
				swap(arr,low,mid);
				low++;
				mid++;
			}
			//case:2
			else if(arr[mid]==1)
			{
				//Not any need of swap
				mid++;
			}
			else {
				swap(arr,low,high);
				high--;
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr={2,0,2,1,1,0};
		findthedutch(arr);
		//need to print all the element
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}