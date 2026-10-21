import java.util.HashMap;
class Char_freq {
	static void charfreqq(String str)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length()-1; i++)
		{
			char ch= str.charAt(i);
			//kya ch jo hain wo as a key availbae hain inisde the map or not i just want to know dude
			if(map.containsKey(ch))
			{
				//yes
				int count=map.get(ch);
				count++;
				map.put(ch,count);
			}
			else {
				//no
				map.put(ch,1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args)
	{
		String str= "leetcode";
		 charfreqq(str);
	}
}