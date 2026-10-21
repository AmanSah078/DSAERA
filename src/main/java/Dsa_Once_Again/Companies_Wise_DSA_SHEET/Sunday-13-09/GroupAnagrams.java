class GroupAnagrams {
	public List<list><String>> togroupanagrams(String str)
	{
		HashMap<String,List<String>> map= new HashMap<>();
		
		//outer loop 
		for(int word = 0; word < string.length(); word++)
		{
			char[] chars= str[word].tocharArray();
			//Now we shoudl sort 
			Arrays.sort(chars);
			//Now we should store the String 
			String key= new String(chars);
			
			if(!map.containsKey(key))
			{
				map.put(key,new ArrayList<>());
			}
			else {
				map.get(key).add(str[word]);
			}
 		}
		return new ArrayList<>(map.values());
	}
	{
		String[] str= {"eat","tea","tan","ate","nat","bat"};

        GroupAnagrams obj = new GroupAnagrams();

        System.out.println(obj.groupanagrams(str));

	}

}