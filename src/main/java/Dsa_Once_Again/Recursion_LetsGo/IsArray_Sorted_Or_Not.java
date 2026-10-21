class IsArray_Sorted_Or_Not{
	static boolean isarraysorted(int[] arr, int index)
	{
		//Base Condition
		//jb humara index last element tk reach ho jayega then smjh jao ki array sorted hain dude
		if(index==arr.length-1)
		{
			return true;
		}
		//now doint fighting with the fucntion
		return arr[index]<arr[index+1] &&  isarraysorted(arr,index+1);
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,5,6,8};
		boolean result=isarraysorted(arr,0);
		System.out.println(result);
	}
}