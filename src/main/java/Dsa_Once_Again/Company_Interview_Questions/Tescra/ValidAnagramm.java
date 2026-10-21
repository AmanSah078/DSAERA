class ValidAnagramm {
	static boolean isvalidanagram(String str, String tsr)
	{
		int[] freq= new int[26];
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			freq[ch-'a']++;
		}
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
		boolean result= isvalidanagram(str,tsr);
		System.out.println(result);
	}
}