class MergeSortt {
	static void to mergeSort(int[]arr1, int[]arr2)
	{
		int i=arr1.length-arr2.length-1;
		int j= arr2.length-1;
		int k= arr.length-1;
		ncl
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
	}
}