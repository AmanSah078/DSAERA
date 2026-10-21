import java.util.HashMap;

class FreqCount {
	static void findthefreq(String str)
	{
		//intially every char is in the form count=1
		//int count=1;
		//create HashMap
		HashMap<Character,Integer> map= new HashMap<>();
		
		//Let's take the loop
		for(int i=0; i<str.length(); i++)
		{
			//convert into char ->It's Mandatory Dude
			char ch= str.charAt(i);
			
			//Now see is the ch is available inside the map as a key or note 
			//->If yes?
			if(map.containsKey(ch))
			{
				//if yes then what i have to do?
				//Here ch->Key 
				int count=map.get(ch);
			    count++;
				//also u need to store dude
			map.put(ch,count);
			//System.out.println(count);
		}
			
			else  {
		//if not then?
		map.put(ch,1);
			}
	}
		System.out.println(map);
		
	}
public static void main(String[] args)
	{
		String str= "banana";
		findthefreq(str);
	}
}