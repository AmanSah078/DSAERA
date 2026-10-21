import java.util.HashMap;

class LongestSubStringWithoutCharacters {
static int toknowlongestsubstring(String str)
{
	
	int maxLength=0;
	int left=0;
	HashMap<Character,Integer> map = new HashMap<>();
	
	for(int i=0; i<str.length(); i++)
	{
		char ch= str.charAt(i);
		//check ch is availabe inside the map as a key 
		//if yes then?
		if(map.containsKey(ch))
		{
		left= Math.max(left,map.get(ch)+1);
	}
	map.put(ch,i);
	maxLength= Math.max(maxLength,i-left+1);
}

	return maxLength;
}
	public static void main(String[] args)
	{
		
		String str= "abcabcbb";
		int result= toknowlongestsubstring(str);
		System.out.println(result);

	}
}