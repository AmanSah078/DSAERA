class RemoveDublicates {
	static void toremovedublicates(int[] arr){
		
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
		System.out.println(arr[arr.length-1]);
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1, 1, 2, 2, 3, 4, 4};
		toremovedublicates(arr);
	}
}