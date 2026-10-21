class FindDubiicateNum {
	static int tofindthedublicatenum(int[] arr)
	{
		int slow= arr[0];
		int fast= arr[0];
		
		//Now its better to check is slow== fast
		
			do {
			slow= nums[slow];
			fast= num[nums[fast]];
		
		}
		while(slow!=fast);
		{
			//reset the slow
			slow= arr[0];
			
		}
		//This is specially to use to find the dublicate 
		while(slow!=fast)
		{
			slow= nums[slow];
			fast= nums[fast];
		}
		return slow;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,2,3,5};
		int result= tofindthedublicatenum(arr);
		System.out.println(result);
	}
}