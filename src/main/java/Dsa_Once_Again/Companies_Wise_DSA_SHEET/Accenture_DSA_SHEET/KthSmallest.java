import java.util.Arrays;
class KthSmallest {
	static void tofindkthsmallest(int[] arr,int k)
	{
		int result=0;
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i]<=arr[k])
			{
				result=arr[k];
			}
			else {
				continue;
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args)
	{
	//	int[] arr= {7, 2, 9, 4, 1};
		int[] arr= {7, 10, 4, 3, 20, 15};
		Arrays.sort(arr);
		tofindkthsmallest(arr,2);
	}
	
}