import java.util.HashMap;
class  LongestSubStringWithoutCharacters  {
	static int toknowlongestsubstring(String str)
	{
		int maxLength=0;
		int left=0;
		HashMap<Character,Integer> map = new HashMap<>();
		
		//now using the loop
		for(int i=0; i<str.length(); i++)
		{
			//convert the string in to the char dude
			char ch= str.charAt(i);
			
			//Phase:1 if the ch is not available inside the map then need to find the maxlength i mean to increase
			
			if(!map.containsKey(ch))
			{
	maxLength = Math.max(maxLength, i - left + 1);
	map.put(ch,i);
			}
			//but now u should ready to fight with the dublicate value let's gooo
			//I mean if the dublicate values is store inside the map the what u should do?
			left = Math.max(left, map.get(ch) + 1);
			 map.put(ch, i);

                maxLength = Math.max(maxLength, i - left + 1);

			
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