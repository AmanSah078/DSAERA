class Rotate_Array_By_K {
	
	//1st method we r using the swap
	static void swap(int[] arr, int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
//To call the swap_Array
	static void reverse(int[] arr, int i, int j)
	{
		
		while(i<j)
		{
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	//Now the third method which is used to reverse the array one by one
	static void rotatearray(int[] arr, int k)
	{
		int n=arr.length;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
	}
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5};
		//llop for the print
		rotatearray(arr,2);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}
