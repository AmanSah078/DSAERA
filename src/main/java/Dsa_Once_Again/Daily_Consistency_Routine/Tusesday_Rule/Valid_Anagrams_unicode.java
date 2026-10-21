import java.util.HashMap;
class Valid_Anagrams_unicode {
	static boolean findthevalidanagrams(String str, String tsr)
	{
		HashMap<Character,Integer> map= new HashMap<>();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch1= str.charAt(i);
			map.put(ch1,i);
			
			
			for(int j=0; j<tsr.length(); j++)
			{
				char ch2= tsr.charAt(j);
				
				if(ch1.equals(ch2))
				{
					return true;
				}
			}
		}
		return false;
	
	}
	public static void main(String[] args)
	{
		String str= "cat";
		String tsr= "rat";
		boolean result=findthevalidanagrams(str,tsr);
		System.out.println(result);
	}
}