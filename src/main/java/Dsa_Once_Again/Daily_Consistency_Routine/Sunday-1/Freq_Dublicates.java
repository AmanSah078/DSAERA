class Freq_Dublicates {
	static char freqofdublicates(String str)
	{
		int[] freq= new int[26];
		for(int i=0; i<str.length()-1; i++)
		{
			char ch= str.charAt(i);
			freq[ch-'a']++;
		}
		//now to print the first dublicates element
		for(int i=0; i<str.length()-1; i++)
		{
			char ch= str.charAt(i);
			if(freq[ch-'a']>1)
			{
				//ek dam ajeeb aadmi hain why u should return here dude break; wo to khud iska mtlb hian ki humare pass dublcates milega then i will print and return so there is no any need to use the break
				return str.charAt(i);
				
			}
		}
		return '\0';
	}
	public static void main(String[] args)
	{
		String str= "hello";
	   char result = freqofdublicates(str);
		System.out.println(result);
	}
	
}