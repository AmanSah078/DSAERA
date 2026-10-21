import java.util.HashMap;
class Freqchar {
	static void tofreqchar(String str)
	{
	HashMap<Character,Integer> map= new HashMap<>();
		for(int i=0; i<str.length(); i++)
		{
			//let's convert in to the char
			char ch = str.charAt(i);
			
			if(map.containsKey(ch))
			{
				int count= map.get(ch);
				count++;
				map.put(ch,count);
				
			}
			else {
				map.put(ch,1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args)
	{
		String str= "java";
		tofreqchar(str);
	}
}