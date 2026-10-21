class Rotate_K {
	
		//1st to swap
		
static void swap(int[] arr, int i, int j)
{
	int temp=arr[i];
	arr[i]= arr[j];
	arr[j]= temp;
	
	
}
	//To complete the revesre
	
	static void reverse(int[] arr, int i, int j)
	{
//		int i=0;
//		int j=arr.length-1;
		while(i<j)
		{
		 swap(arr,i,j);
			i++;
			j--;
		}
	}
	//now the final method to call according to the rule
	static void totraverse(int[] arr, int k)
	{
		int n=arr.length-1;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k, n-1);
		reverse(arr,0,n-1);
	}
	//to print 
	
	public static void main(String[] args)
	{
		int[] arr = {3,4,5,6,7,3,2};
		//index 3 se dude 
		 totraverse(arr,3);
		for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i] +  " ");
	}
		
	}
}