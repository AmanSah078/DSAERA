class String_Palindrom {
	static boolean stringpalindrome(String str)
	{
		//convert in to char compulsory
		int i=0;
		int j= str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
		{
			return false;
		}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args)
	{
	String str= "madam";
	boolean result=stringpalindrome(str);
	System.out.println(result);
	}
}