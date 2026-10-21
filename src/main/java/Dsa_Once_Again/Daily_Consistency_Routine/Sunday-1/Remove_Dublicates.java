import java.util.Arrays;
class Remove_Dublicates {
	static void toremove(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]==arr[i+1])
			{
				continue;
			}
			else {
				System.out.print(arr[i] + " ");
			}
		}
		int last=arr[arr.length-1];
		System.out.println(last);
	}
	public static void main(String[] args)
	{
		int[] arr= {2,3,4,5,3,2,2};
		Arrays.sort(arr);
		toremove(arr);
	}
}