class Kedan_Algorithm {
	static void findthekedans(int[] arr)
{
	int max=arr[0];
	int currsum=arr[0];
	//outer loop
	for(int i=1; i<arr.length; i++)
	{
		if(currsum>0)
		{
			currsum=currsum+arr[i];
		}
		else  {
			currsum=arr[i];
		}
		
		
		
		if(currsum>max)
		{
			max=currsum;
		}
	}
	
	System.out.println(max + " ");
}
public static void main(String[] args)
{
	int[] arr= {2, 3, -8, 7, -1, 2, 3};
	//int[] arr={-2,-4};
	findthekedans(arr);
}
}