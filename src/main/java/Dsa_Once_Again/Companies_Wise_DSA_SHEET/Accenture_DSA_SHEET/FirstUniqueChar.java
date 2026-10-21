class FirstUniqueChar {
	static int tofirstchar(String str)
	{
		int[] freq= new int[26];
		for(int i=0; i<str.length(); i++)
		{
		  char ch=str.charAt(i);
		  freq[ch-'a']++;
		}
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
		String str="loveleetcode";
		int result= tofirstchar(str);
		System.out.println(result);
	}
}