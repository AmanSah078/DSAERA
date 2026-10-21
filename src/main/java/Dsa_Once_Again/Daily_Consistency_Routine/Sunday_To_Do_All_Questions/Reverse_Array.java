class Reverse_Array{
	static void reversearray(int[] arr)
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			
			i++;
			j--;
		}
//		for(int k=0; i<arr.length; i++)
//		{
//			System.out.println(arr[k] + " ");
//		}
	}
	public static void main(String[] args)
	{
		int[] arr={1, 4, 3, 2, 6, 5};
		reversearray(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
}