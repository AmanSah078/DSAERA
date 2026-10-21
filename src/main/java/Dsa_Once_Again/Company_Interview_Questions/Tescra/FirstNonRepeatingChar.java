class FirstNonRepeatingChar {
	static char firstNonRepeating(String str)
	{
		int[] freq= new int[26];
		for(int i=0; i<str.length(); i++)
		{
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
	  public static void main(String[] args) {
        String str = "aabbcde";
        char result = firstNonRepeating(str);

        if (result == '\0') {
            System.out.println("No non-repeating character");
        } else {
            System.out.println(result);
        }
    }
	
	
}