//import java.util.Arrays;
// Import HashMap
import java.util.HashMap;
class Occurance{
static void findtheoccurance(String str)
{
	
        HashMap<Character, Integer> map = new HashMap<>();

	for(int i=0; i<str.length(); i++)
	{
		char ch= str.charAt(i);
		
		//now check is ch is avaialble inside the map as a key or not
		if(map.containsKey(ch))
		{
			//if yes then?
			int count= map.get(ch);
			count++;
			//now put
			map.put(ch,count);
		}
		else  {
			map.put(ch,1);
		}
	}
	//u have to print the map dude but why where u can see the count of each and every char
	System.out.println(map);
}
	public static void main(String[] args)
	{
		String str= "programming";
	findtheoccurance(str);

	}
}