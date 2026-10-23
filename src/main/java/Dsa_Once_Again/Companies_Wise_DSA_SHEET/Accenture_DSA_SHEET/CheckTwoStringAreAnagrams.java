class CheckTwoStringAreAnagrams {
	static boolean tochecktwostranagrams(String str, String tsr)
	{
		int[] freq= new int[26];
		
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			freq[ch-'a']++;
		}
		//Now Let's goo for the 2nd String 
		for(int j=0; j<tsr.length(); j++)
		{
			char ch= tsr.charAt(j);
			freq[ch-'a']--;
		}
		//Now its time to compare
		
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
//		String str= "aced";
//		String tsr="ceda";
		String str= "allergy";
		String tsr= "allergyy";
		boolean result= tochecktwostranagrams(str,tsr);
		System.out.println(result);
	}
}