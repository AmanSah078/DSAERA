import java.util.HashMap;
class First_Unique {
	static void findtheunique(String str)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			
			if(map.containsKey(ch))
			{
				int count= map.get(ch);
				count++;
				//to store
				map.put(ch,count);
				
			}
			else  {
				map.put(ch,1);
			}
		}
		//u have to use the one more loop dude
		for(int i=0; i<str.length(); i++)
		{
			//convert in to the char
			 char ch=str.charAt(i);
			if(map.get(ch)==1)
			{
				System.out.println(i);
				break;
			}
		}
		
		//now for the unique char ke liye
		
	}
	
	public static void main(String[] args)
	{
		String str="leetcode";
		findtheunique(str);
	}
}