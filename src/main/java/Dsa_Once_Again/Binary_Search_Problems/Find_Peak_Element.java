class Find_Peak_Element
{
	 static int findthepeakele(int[] arr)
	{
		int start=0;
		int end= arr.length-1;
		 //There is not any need to use the start<=end why? just because u r comparing the current element to the next element na dude - Okay Understood 
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]<arr[mid+1])
			{
			
				start=mid+1;
			}
			else {
				end=mid;
			}
		}
		
		return end;
	}
	public static void main(String[] args)
	{
		int[] arr={1,2,3,5,6,4,3,2};
		int result=findthepeakele(arr);
		System.out.println(result);
	}
}