//Let's gooo
class Count_Zeros {
	//creaate funciton
	static int findthecountzeros(int[] arr,start)
	{
		if(arr[start]==0)
		{
			return 1+findthecountzeros(arr,start+1);
		}
		return findthecountzeros(arr,start+1);
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,1,0,0,,0};
		int result=findthecountzeros(arr,0);
		System.out.println(result);
	}
}