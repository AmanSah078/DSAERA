class check_Sorted_or_not_ByUsing_Recursive {
	//create funct
static boolean issorted(int[] arr, int index)
{
	if(index==arr.length-1)
	{
		return true;
	
	}

	
	
	return issorted(arr[index]>arr[index+1], index+1);
	
}
	public static void main(String[] args)
	{
		int[] arr={1,2,3,71,5};
		boolean result= issorted(arr,0);
		System.out.println(result);
	}
}
