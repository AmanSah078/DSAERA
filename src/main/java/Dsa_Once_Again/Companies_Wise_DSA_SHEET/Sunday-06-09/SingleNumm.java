class SingleNumm {
	static int tofinduniquenum(int[] arr)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		//Take the outer loop
		for(int i=0; i<arr.length; i++)
		{
			if(map.get(arr[i]))
			{
				int count= map.get(arr[i]);
				count++;
				map.put(arr[i], count);
			}
			else {
				map.put(arr[i],1);
			}
		}
		//Now wahi chahiye jo ek baar aaya hain
		for(int j=0; j<arr.length; j++)
		{
			//if(map.get(arr[i]==1))
			if (map.get(arr[i]) == 1)
			{
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr = {2,2,1};
		int result= tofinduniquenum(arr);
		System.out.println(result);
	}
}