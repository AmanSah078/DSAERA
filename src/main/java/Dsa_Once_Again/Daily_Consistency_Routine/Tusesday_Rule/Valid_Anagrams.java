class Valid_Anagrams {
	static boolean tofindvalidanagrams(String s, String t)
	{
		//First i have to store inside the 26 char in array
		int[] arr=new int[26];
		//use the outer loop 
		for(int i=0; i<s.length(); i++)
		{
		//convert in to char
		    char ch=s.charAt(i);
		//To find the freq	
			arr[ch-'a']++;
		
		}
			for(int j=0; j<t.length(); j++)
			{
		    char ch1=t.charAt(j);
			arr[ch1-'a']--;	
			}
		
	//Now finally we'll store our char inside the array 
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
//		String s="car";
//		String t="cat";
		String s="anagram";
		String t="nagaram";
		boolean result=tofindvalidanagrams(s,t);
		System.out.println(result);
	}
}