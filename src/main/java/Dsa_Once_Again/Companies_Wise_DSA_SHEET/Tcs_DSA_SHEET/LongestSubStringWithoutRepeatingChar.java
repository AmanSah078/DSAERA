class LongestSubStringWithoutRepeatingChar {
	static int longestsubstring(String str)
	{
		int MaxLength=0;
		int left=0;
		HashMap<Integer,Character> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++)
		{
			//change in to the char dude
			char ch= str.charAt(i);
			
			//check-> if ch is availabein inside the map or not 
		    //->If yes-> then we use the left
			if(map.getContainsKey(ch))
			{
			left= Math.max(left,map.get(ch)+1);
		    }
			map.put(ch,i);
			//otherwise need to use the MaxLength
			MaxLength= Math.max(MaxLength, i-left+1);
		}
		return MaxLength;
	}
	public static void main(String[] args)
		
	{
		String str=  "geeksforgeeks";
		int result= longestsubstring(str);
		System.out.println(result);
	}
}