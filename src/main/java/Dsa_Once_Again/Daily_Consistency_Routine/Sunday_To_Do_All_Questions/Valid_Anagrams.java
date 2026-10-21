import java.util.HashMap;
class Valid_Anagrams {
	static boolean tocheckvalidang(String str, String tsr)
	{
		HashMap<Character,Integer> map= new HashMap<>();
		//outer loop
		for(int i=0; i<str.length(); i++)
		{
			//compulsory to convert in to the char
			char ch= str.charAt(i);
			//My responsibliyt to keep in to the map
			map.put(ch,i);
			
		}
		//Lets go to use the inner loop 
		for(int j=0; j<tsr.length(); j++)
		{
			char ch1 = tsr.charAt(j);
			
			//now its time toc compare
			//What is the meaning dude dude meaining is simple i mean to say that is the ch1 character is availbe inside the map as a key or not, 
			if(map.containsKey(ch1))
			{
				return true;
			}
		}
			return false;
			   }
	
	
	public static void main(String[] args)
	{
		String str= "madam";
		String tsr="body";
		boolean result=tocheckvalidang(str,tsr);
		System.out.println(result);
	}
	
}