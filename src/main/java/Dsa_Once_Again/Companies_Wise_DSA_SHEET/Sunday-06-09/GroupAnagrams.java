import java.util.HashMap;
import java.util.Arrays;
class GroupAnagrams {
	public List<List<String>> togroupanagrams(String str)
	{
		//outer loop
		for(int word=0; word<str.length; word++)
		{
			//convert in to the char
			chars ch= str[word].tocharArray();
			
			//Now to sort the Array
			Arrays.sort(chars);
			
			//Now to convert the char in to the String
			String key= new String(chars);
			
			//Now to check the key is really inside the map or not if not then ?
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
	public static void main(String[] args)
	{
		String[] str= {"eat","tea","tan","ate","nat","bat"};

        GroupAnagrams obj = new GroupAnagrams();

        System.out.println(obj.groupanagrams(str));

	}
}