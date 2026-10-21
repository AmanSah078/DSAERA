class RemoveDubilcate {
	static void toremove(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]==arr[i+1])
			{
				continue;
			}
			else {
				System.out.println(arr[i] + " ");
			}
		}
		//last element
		System.out.println(arr[arr.length-1]);
	}
	public static void main(String[] args)
	{
		int[] arr= {1,1,2,2,3};
		toremove(arr);
	}
}