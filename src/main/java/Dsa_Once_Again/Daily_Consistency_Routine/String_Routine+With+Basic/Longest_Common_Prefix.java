class Longest_Common_Prefix {
	//use one method
	static String findthellongestcompre(String[] str)
	{
		//To strore the String 
		StringBuilder ans = new StringBuilder();
		//Take the 1st string as a reference
		String first= str[0];
		
		//Speciialy convert the 1st string in to the char
		for(int i=0; i<first.length(); i++)
		{
	    //Change the String in to the char format
		//char[] ch=str.charArray();
		//char[] ch = str.toCharArray(); Not any need
			
		//2nd loop start from the j=1 because 1st string i get as ref na 
			for(int j=1; j<str.length; j++)
			{
				//compare the first index to the length of the String
				if(i>=str[j].length())
				{
					    return ans.toString(); //->use Jo characters maine StringBuilder mein collect kiye hain, unko ek normal String bana ke return kar do.
				}
	            if (first.charAt(i) != str[j].charAt(i)) {
                return ans.toString();
                }
			}
			ans.append(first.charAt(i));
		}
		return ans.toString();
	}
	
	public static void main(String[] args)
	{
		String[] str={"flower","fl","flight"};
		String result= findthellongestcompre(str);
		System.out.println(result);
	}
}