import java.util.HashMap;
class Dublicates {
	static boolean isdublicate(String str)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0; i<str.length()-1; i++)
		{
			char ch= str.charAt(i);
			
			//now check kya ch is available inside the map as a key or not
			if(map.containsKey(ch))
			{
					//if(map.containsKey(ch))
				//if yes 
				return true;
			}
			else {
				map.put(ch,i);
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		//String str= "aman";
		String str= "hey";
		boolean result= isdublicate(str);
		System.out.println(result);
	}
}