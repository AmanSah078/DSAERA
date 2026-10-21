class ValidAnagram {
	static boolean tovalidanagram(String str, String tsr)
	{
		int[] freq= new int[26];
		for(int i=0; i<str.length(); i++)
		{
			//convert in to the char
			char ch= str.charAt(i);
			freq[ch-'a']++;
		}
		//inner loop
		for(int j=0; j<tsr.length(); j++)
		{
			char ch= tsr.charAt(j);
			freq[ch-'a']--;
		}
		for(int i=0; i<26; i++)
		{
			if(freq[i]!=0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		String str= "anagram";
		String tsr= "nagaram";
//		String str= "rat";
//		String tsr="cat";
		boolean result= tovalidanagram(str,tsr);
		System.out.println(result);
	}
	
}