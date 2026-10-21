class SingleNum {
	static void togetunique(int[] arr)
	{
		HashSet<Integer> set= new HashSet<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(set.contains(arr))
			{
				set.remove(arr[i]);
			}
			else{
				set.add(arr[i]);
			}
		}
		System.out.println(set);
	}
}