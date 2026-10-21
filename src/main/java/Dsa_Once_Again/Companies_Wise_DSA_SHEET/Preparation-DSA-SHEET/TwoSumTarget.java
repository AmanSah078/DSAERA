import java.util.Arrays;
class TwoSumTarget {
	static int[] twosum(int[] arr,int target)
	{
		int i=0;
		int j=arr.length-1;
//		int sum=0;
		while(i<j)
		{
			int sum= arr[i]+arr[j];
			if(target<sum)
			{
				j--;
			}
			else if(target>sum)
			{
				i++;
			}
			else {
				//return i + " " + j;
				return new int[]{i, j};
			}
		}
		return new int[]{-1, -1};
	}
	public static void main(String[] args)
	{
		int[] arr = {2,7,11,15};
		int result[]= twosum(arr,9);
	//	System.out.println(result);
//		        System.out.println(result[0] + " " + result[1]);
		System.out.println(Arrays.toString(result));
	}
}