class SearchPostion {
	static int serachtheposition(int[] arr, int target)
		
	{
	int start=0;
	int end=arr.length-1;
	//int mid=start+(end-start)/2;
	while(start<end)
	{
		int mid=start+(end-start)/2;
		//Let's goo Case:1
		if(arr[mid]>=target)
		{
			//return arr[mid];
			return mid;
		}
		else if(arr[mid]>target)
		{
			end=mid-1;
		}
		else {
			start= mid+1;
		}
	}
	return arr.length;

}
	public static void main(String[] args)
	{
		int[] arr = {1,3,5,6};
		int result=serachtheposition(arr,2);
		System.out.println(result);
	}
}
