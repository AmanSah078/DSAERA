import java.util.Arrays;
class Missing_Number {
	static int findthemissingnum(int[] arr)
	{
		int index=0;
		//Take one loop first
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]+1!=arr[i+1])
			{
				index=i+1;
			}
//			else {
//				return -1;
//			}
		}
		return index;
	}
	public static void main(String[] args)
	{
		//int[] arr={3,0,1};
		int[] arr={9,6,4,2,3,5,7,0,1};
		Arrays.sort(arr);
		int result=findthemissingnum(arr);
		System.out.println(result);
	}
	
}