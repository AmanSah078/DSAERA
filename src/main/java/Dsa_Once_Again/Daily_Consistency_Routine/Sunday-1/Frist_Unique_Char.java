class Frist_Unique_Char {
	static char findfirstunique(String str)
	{
		int[] freq= new int[26];
		for(int i=0; i<str.length()-1; i++)
		{
		 char ch= str.charAt(i);
		 freq[ch-'a']++;
		}
		//specila loop
		//one loop to find the freq
		for(int i=0; i<str.length()-1; i++)
		{
         char ch=str.charAt(i);
		 if(freq[ch-'a']==1)
		{
			return str.charAt(i);
		}
		}
		
//return '\0';
		return '/0';
		
	}
	public static void main(String[] args)
	{
		//String str= "leetcode";
		String str= "hohmot";
		char ch =findfirstunique(str);
		System.out.println(ch);
	}
}