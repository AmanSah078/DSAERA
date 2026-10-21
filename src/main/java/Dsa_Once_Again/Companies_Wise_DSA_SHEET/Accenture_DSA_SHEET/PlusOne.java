class PlusOne {
	static void toaddplusone(int[] arr)
	{
		int store=0;
		for(int i=0; i<arr.length; i++)
		{
			if(store>=arr.length-1)
			{
				arr[store]= arr[i]+1;
			}
			else {
				arr[store]= arr[i];
				store++;
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args)
	{
		//int[] arr= {1,2,3};
		//int[] arr= {9};
		int[] arr= {4,3,2,1};
		toaddplusone(arr);
	}
	}
