class Reverse_Words {
	static void reversewords(String str)
	{
		//To remove the extra space
		str= str.trim();
		//To convert in to the lower case
		str= str.toLowerCase();
		//i just split the string in to words
		String[] words = str.split("\\s+");

		for(int i=words.length-1; i>=0; i--)
		{
			System.out.print(words[i] + " ");
		}
	}
	public static void main(String[] args)
	{
		String str="i am enough to destroy you";
		reversewords(str);
			
	}
}
