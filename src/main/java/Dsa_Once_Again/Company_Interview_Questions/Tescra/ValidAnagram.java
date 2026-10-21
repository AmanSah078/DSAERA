class ValidAnagram {
	static boolean isvalidAnagram(String str, String tsr)
		
	{
		int[] arr= new int[26];
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			arr[ch-'a']++;
		}
		//outer loop
		for(int j=0; j<tsr.length(); j++)
		{
			char ch= tsr.charAt(j);
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
		String str= "javka";
		String tsr="avaj";
		boolean result= isvalidAnagram(str,tsr);
		System.out.println(result);
	}
}