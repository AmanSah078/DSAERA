class Rotation_Count {
	//this is the method or i can say this is the main method
	static int countRotations(int[] arr)
	{
	int pivot=findpivot(arr);
//		if(pivot==-1)
//		{
////array is not sorted			
//			return 0;
//		}
		return pivot+1;
	}
	
	
//To find the pivot for the non dublicates
	
static int findpivot(int[] arr)
{
	int start=0;
	int end=arr.length-1;
	int mid=start+(end-start)/2;
	
	//case:`1-> when our mid is equal to pivot then 
	if(mid<end && arr[mid]>arr[mid+1])
	{
		return mid;
	}
	//case:2
	else if(mid>start && arr[mid]<arr[mid-1])
	{
		return mid-1;
	}
	//case:3
	else if(arr[mid]<arr[start])
	{
		end=mid-1;
	}
	else {
		start=mid+1;
	}
	
	return -1;
}
	public static void main(String[] args)
	{
		int[] arr={15,18,2,3,6,12};
		int result=countRotations(arr);
		System.out.println(result);
	}
	
}