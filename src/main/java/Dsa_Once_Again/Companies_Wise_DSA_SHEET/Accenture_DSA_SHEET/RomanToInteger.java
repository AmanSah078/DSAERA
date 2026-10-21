import java.util.HashMap;
class RomanToInteger {
	static void toromantointeger(String str)
	{
		int sum=0;
	HashMap<Character,Integer> map = new HashMap<>();
	
map.put('I', 1);
map.put('V', 5);
map.put('X', 10);
map.put('L', 50);
map.put('C', 100);
map.put('D', 500);
map.put('M', 1000);
		
		for(int i=0; i<str.length(); i++)
		{
			int value= map.get(str.charAt(i));
			sum=sum+value;
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		String str= "III";
		toromantointeger(str);
	}
}