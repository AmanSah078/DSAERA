class Valid_Anagrams {
	static boolean validanagrams(String str,String tsr)
	{
		int[] arr= new int[26];
		 //to destroy the String str
		for(int i=0; i<str.length()-1; i++)
		{
		 //convert in to the char
		   char ch= str.charAt(i);
			//now to count the char 
		   arr[ch-'a']++;
		}
		//To destroy the String tsr
		for(int i=0; i<tsr.length()-1; i++)
		{
			//convert in to the char
			char ch= str.charAt(i);
			arr[ch-'a']--;
		}
		//now it's time to verify 
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
		String str="alexaw";
		String tsr="xaelar";
		boolean result=validanagrams(str,tsr);
		System.out.println(result);
	}
	
}