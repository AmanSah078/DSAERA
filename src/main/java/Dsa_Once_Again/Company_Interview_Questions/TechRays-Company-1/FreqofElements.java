class FreqofElements {
	static void tofreq(int[] arr)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				int count= map.get(arr[i]);
				count++;
				map.put(arr[i],count);
			}
			else {
				map.put(arr[i],1);
			}
		}
		System.out.println(map);
	}
}
