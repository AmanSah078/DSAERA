import java.util.Arrays;
class MissingNum {
	static int tomissingNum(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]+1!=arr[i+1])
			{
				return  i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		//int[] arr= {3,0,1};
		int[] arr= {9, 6, 4, 2, 3, 5, 7, 0, 1};
		Arrays.sort(arr);
		int result= tomissingNum(arr);
		System.out.println(result);
	}
}