class ValidAnagrams {
	static boolean isanagrams(String str, String tsr)
	{
		//let find the freq 
		int[]arr= new int[26];
		
		//destroy the 1st string
		for(int i=0; i<str.length()-1; i++)
		{
			char ch= str.charAt(i);
			arr[ch-'a']++;
		}
		//Now to destroy the 2nd String
		for(int i=0; i<tsr.length()-1; i++)
		{
			char ch= tsr.charAt(i);
			arr[ch-'a']--;
		}
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
		String tsr= "cat";
		boolean result= isanagrams(str,tsr);
		System.out.println(result);
	}
	
}