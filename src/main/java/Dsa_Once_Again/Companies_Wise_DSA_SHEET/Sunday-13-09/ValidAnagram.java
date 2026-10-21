class ValidAnagram {
	static boolean isvalidAnagram(String str,  String tsr)
	{
		//Let's find the Frequency
		int[] arr= new int[26];
		
		//outer looop
		
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			arr[ch-'a']++;
		}
		//now one more loop
		
		for(int i=0; i<tsr.length(); i++)
		{
			char ch= tsr.charAt(i);
			arr[ch-'a']--;
		}
		//Now Let's goo
		for(int i=0; i<26; i++)
		{
			if(arr[i]!=0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
//		String str= "anagram";
//		String tsr= "nagaram";
		String str= "rat";
		String tsr= "car";
		boolean result= isvalidAnagram(str,tsr);
		System.out.println(result);
	}
}