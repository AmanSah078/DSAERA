import java.util.*;
class CheckConstAndVowel {
	static void tocheckvowelandcons(String str)
	{
		HashSet<Character> set= new HashSet<>();
		
		int v=0;
		int c=0;
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		
		for(int i=0; i<str.length(); i++)
		{
		  //convert in to the char
			char ch= str.charAt(i);
			
			if(set.contains(ch))
			{
				v++;
			}
			else {
				c++;
			}
		}
		if(v>c)
		{
			System.out.println("Yeah");
		}
		else {
			System.out.println("Nope");
		}
	}
	public static void main(String[] args)
	{
		//String str= "aaaaa";
		String str= " thequickbrownfoxjumpsoverthelazydog";
		tocheckvowelandcons(str);
	}
}