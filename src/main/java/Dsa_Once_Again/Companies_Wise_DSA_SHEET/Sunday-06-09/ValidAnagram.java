class ValidAnagram {
	static boolean isvalidanagram(String str, String tsr)
	{
		int[] freq= new int[26];
		//Let's kill the 1st String
		
		for(int i=0; i<str.length(); i++)
		{
			//convert into the char
			char ch= str.charAt(i);
			freq[ch-'a']++;
		}
		
		//Let's kill the 2nd String
		for(int j=0; j<tsr.length(); j++)
		{
			char ch1= tsr.charAt(j);
			freq[ch1-'a']--;
		}
		
		//now i think its time to compare with
		
		for(int i=0; i<freq.length; i++)
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
//		String str= "anagram";
//		String tsr= "nagaram";
		String str = "rat";
		String tsr= "car";
		boolean result= isvalidanagram(str,tsr);
		System.out.println(result);
	}
}