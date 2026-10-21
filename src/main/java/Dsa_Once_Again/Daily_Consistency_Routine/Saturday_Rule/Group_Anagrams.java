class Group_Anagrams {
	static void togrouptheanagrams(String[] str)
	{
		//1st 
		HashMap<String,List><String> map= new HashMap<>();
		
		//now its time to traverse
		for(String word: str)
		{
			//convert String in to char
			char[] arr= word.tocharArray();
			
			//now sot the char
			Arrays.sort(arr);
			//Convert the sorted char in to the String
			String key= new String(arr);
			
			//check inside the map
			if(!conatinsKey(key))
			{
				map.put(Key,new Array)
			}
		}
	}
}