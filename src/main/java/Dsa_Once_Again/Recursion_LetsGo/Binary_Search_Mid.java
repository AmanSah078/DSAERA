class Binary_Search_Mid {
	static int binarysearch(int[] arr, int target, int start, int end)
	{
		int mid=start+(end-start)/2;
		//now apply conditon
		if(arr[mid]==target)
		{
			//return arr[mid];
			return mid;
		}
		if(arr[mid]<target)
		{
			return binarysearch(arr,target,mid+1,end);
		}
		return binarysearch(arr,target,start,end-1);
		
	}
	public static void main(String[] args)
	{
		int[] arr= {-1,0,3,5,9,12};
		int result= binarysearch(arr,9,0,arr.length-1);
		System.out.println(result);
	}
}