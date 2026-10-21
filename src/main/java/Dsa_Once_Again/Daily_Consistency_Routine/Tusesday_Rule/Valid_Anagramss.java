//Constraints:
//
//1 <= s.length, t.length <= 5 * 104
//s and t consist of lowercase English letters.


class Valid_Anagramss {
	static boolean findthevalidanagrams(String str, String tsr)
	{
		//need to store
		int[] arr= new int[26];
		
		//outer-loop
		for(int i=0; i<str.length(); i++)
		{
			//convert in to the char
			char ch1= str.charAt(i);	
			//to count the char
			arr[ch1-'a']++;
		}
		//inner loop
		for(int j=0; j<str.length(); j++)
		{
			char ch2= tsr.charAt(j);
			//to count the char
			arr[ch2-'a']--;
		}
		//Now need to compare the freq
		for(int i=0; i<26; i++)
		{
			if(arr[i]!=0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		String str= "rat";
		String tsr="car";
		boolean result= findthevalidanagrams(str,tsr);
		System.out.println(result);
	}
}