class FirstUniqueChar {
	static int firstunique(String str)
	{
		int[] arr =new int[26];
	//convert in to the char
		for(int i=0; i<str.length(); i++)
		{
		char ch= str.charAt(i);
			arr[ch-'a']++;
		}
		for(int i=0; i<str.length(); i++)
		{
		char ch=str.charAt(i);
		if(arr[ch-'a']==1)
		{
			return i;

		}
		}
		return  -1;
	}
	public static void main(String[] args)
	{
		String str= "leetcode";
		int result= firstunique(str);
		System.out.println(result);
	}
}