class MergeSort {
	static void tomergesort(int[] arr1, int arr2)
	{
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k= arr1.length-1;
		
		while(j>=0)
		{
		if(i>=0 && arr1[i]>arr2[j])
		{
			arr1[k]= arr1[i];
			i--;
		}
			else {
				arr1[k]= arr2[j];
				j--;
			}
			k--;
		}
		System.out.println(Arrays.toString(arr1));
	}
	
}