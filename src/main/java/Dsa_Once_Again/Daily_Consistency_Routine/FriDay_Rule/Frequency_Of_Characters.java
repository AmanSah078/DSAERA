import java.util.HashMap;
class Frequency_Of_Characters {
	static void findthefreqofchar(String str)
	{
		//use the Hashmmap
		HashMap<Character,Integer> map = new HashMap<>();
		
		
		//now inner loop
		for(int i=0; i<str.length(); i++)
		{
			char ch1= str.charAt(i);
			if(map.containsKey(ch1))
			{
				int count=map.get(ch1);
				count++;
				map.put(ch1,count);
			}
			else {
				map.put(ch1,1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args)
	{
		String str= "elephant";
		findthefreqofchar(str);
	}
}