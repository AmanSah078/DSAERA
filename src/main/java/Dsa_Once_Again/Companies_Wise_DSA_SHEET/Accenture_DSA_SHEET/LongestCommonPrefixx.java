class LongestCommonPrefixx {
	static String tocmnprefix(String[] str)
	{
		String first= str[0];
		
		//outer loop
		for(int i=0; i<first.length(); i++)
		{
			//convert in to the char
			char ch= first.charAt(i);
		
		
		//inner loop
		for(int j=1; j<str.length; j++)
		{
			//now apply condition
			if(i>=str[j].length() || str[j].charAt(i)!=ch )
			{
				return first.substring(0,i);
			}
		}
		}
		return first;
	}
	public static void main(String[]args)
	{
		String[]str= {"interview", "interest","intoke"};
		String result= tocmnprefix(str);
		System.out.println(result);
	}
}