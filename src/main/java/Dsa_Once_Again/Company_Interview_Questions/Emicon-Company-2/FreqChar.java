import java.util.HashMap;
class FreqChar {

static void tofreqchar(String str)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			
			//now apply condtion
			if(map.containsKey(ch))
			{
				int count=map.get(ch);
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
		String str= "Programming";
		tofreqchar(str);
	}
}