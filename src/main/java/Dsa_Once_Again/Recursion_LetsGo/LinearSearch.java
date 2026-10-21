class LinearSearch {
	static int find(int[] arr, int target, int index)
	{
		//Base conditon
		//jb our arr.length==index ho jayega it means our target element dont match to any element
		//It means pura jangal khoj liya lekin sher mila hi nhi
		if(index==arr.length)
		{
			return -1;
		}
		if(arr[index]==target)
		{
			return index;
		}
		else {
			 return find(arr,target,index+1);
		}
	}
	public static void main(String[] args)
	{
		int[] arr={1,2,3,5,16,8};
		int result=find(arr,17,0);
		System.out.println(result);
		
	}
}