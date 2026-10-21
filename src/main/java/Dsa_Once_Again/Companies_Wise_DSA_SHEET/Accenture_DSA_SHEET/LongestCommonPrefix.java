class LongestCommonPrefix {
	static String longestcmnprefix(String[] str)
	{
		  if (str == null || str.length == 0) {
            return "";
        }
		//intially 
		String first= str[0];
		
		//outer loop
		for(int i=0; i<first.length(); i++)
		{
			//convert in to the char
			char ch = first.charAt(i);
			
			//inner loop
			for(int j=1; j<str.length; j++)
			{
				if(i>=str[j].length() || str[j].charAt(i)!=ch)
				{
					return first.substring(0,i);
				}
			}
		}
		return first;
	}
	public static void main(String[] args)
	{
		String str[]= {"flower","flow","flight"};
		String result= longestcmnprefix(str);
		System.out.println(result);
	}
}