class Valid_Palindrome {
	static boolean findthepalindrome(String str)
	{
		//must to convert in to the char
		//arr dude u should sovle through the two pointer
		int i=0;
		int j = s.length() - 1;
		while(i<j)
		{
			if(charAt(i)==charAt(j))
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		boolean result= findthepalindrome(str);
		System.out.println(result);
	}
}