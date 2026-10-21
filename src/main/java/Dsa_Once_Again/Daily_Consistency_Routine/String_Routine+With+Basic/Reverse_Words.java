class Reverse_Words{
	static void reversewords(String str)
	{
		for(int i=str.length()-1; i>=0; i--)
		{
		str = str.toLowerCase(); // Converts string to lowercase
		str=str.trim();
		}
		for(int i=0; i<str.length()-1; i++)
		{
			System.out.println(str);
		}
	}
	public static void main(String[] args)
	{
		String str="I Love You";
		reversewords(str[i]);
	}
		
	}
