class Lower_Bound {
	static int findthelowerbound(int[] arr, int x)
	{
	 int start=0;
     int end=arr.length-1;
	 if(x>arr.length)
		{
		return arr.length;
       	}
	 while(start<end)
	 {
		 int mid=start+(end-start)/2;
		 
		 if(x>arr[mid])
		 {
			start=mid+1;
	     }
		 else if(x<arr[mid])
		 {
			 end=mid-1;
		 }
		 else {
			 return mid;
		 }
	}
		return start;
	}
	public static void main(String[] args)
	{
		int[] arr={1,2,4,4,5,7};
		int result=findthelowerbound(arr,6);
		System.out.println(result);
	}
}