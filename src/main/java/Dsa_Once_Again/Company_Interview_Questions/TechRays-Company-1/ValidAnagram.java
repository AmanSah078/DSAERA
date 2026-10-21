class ValidAnagram {
	static boolean isvalidAnagram(String str, String tsr)
	{
		int[] freq= new int[26];
		
		//Let's find the freq of 1st String
		for(int i=0; i<str.length(); i++)
		{
			//convert in to the char
			char ch= str.charAt(i);
			freq[ch-'a']++;
		}
		//Now to find the freq of the 2nd String
		for(int j=0; j<tsr.length(); j++)
		{
			char ch= tsr.charAt(j);
			freq[ch-'a']--;
		}
		//Now to final
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
		String str = "listeiin";
		String tsr= "silent";
		boolean result= isvalidAnagram(str,tsr);
		System.out.println(result);
	}
	
	}
