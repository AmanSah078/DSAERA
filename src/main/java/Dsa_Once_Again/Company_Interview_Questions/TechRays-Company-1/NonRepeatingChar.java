class NonRepeatingChar {
	static char tononrepeating(String str) {
		
		//find the freq
		int freq[] = new int[26];
		//convert in to the char
		for(int i=0; i<str.length(); i++){
			
			char ch= str.charAt(i);
			freq[ch-'a']++;
		}
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			if(freq[ch-'a']==1)
			{
				return ch;
			}
		}
		return '\0';
	}
	public static void main(String[] args)
	{
		String str = "swiss";
		char result= tononrepeating(str);
		System.out.println(result);
	}
}