class FirstUniqueChar{
	static int firstunique(String str)
	{
		int[] freq= new int[26];
		for(int i=0; i<str.length(); i++)
		{
			//convert in to the char
			char ch=str.charAt(i);
			freq[ch-'a']++;
		}
		//now this loop to find the uniqiue character
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			if(freq[ch-'a']==1)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		//String str= "leetcode";
		String str= "aabb";
		int result = firstunique(str);
		System.out.println(result);
	}
}