class SingleNum {
	static int tofinduniqnum(int[] arr)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				//if yes then 
				int count = map.get(arr[i]);
				count++;
				map.put(arr[i],1);
			}
		}
		//now this loop
		for(int i=0; i<arr.length; i++)
		{
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
		int result= tofinduniqnum(arr);
		System.out.println(result);
	}

}