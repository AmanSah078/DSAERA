import java.util.Arrays;
class MissingNumber {
	static int missingnum(int[] arr)
	{
		int index=0;
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]+1!=arr[i+1])
			{
				return arr[i]+1;
//				break;
			}
		}
		System.out.println(arr[arr.length-1]);
		return -1;
	}
	public static void main(String[] args)
	{
		//int[] arr= {1,2,4,5};
		int[] arr={9,6,4,2,3,5,7,0,1};
		Arrays.sort(arr);
		int result= missingnum(arr);
		System.out.println(result);
	}
}