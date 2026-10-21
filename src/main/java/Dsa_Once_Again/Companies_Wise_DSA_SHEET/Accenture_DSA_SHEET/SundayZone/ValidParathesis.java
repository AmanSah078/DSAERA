
import java.util.*;
class ValidParathesis {
	static boolean tovalidparathesis(String str)
	{
		//HashMap
		HashMap<Character,Character> map= new HashMap<>();
		
		//let's put
		map.put('(',')');
		map.put('{','}');
		map.put('[',']');
		
		Stack<Character> stack= new Stack<>();
	 	
		for(int i=0; i<str.length(); i++)
		{
			//convert in to the char
			char ch= str.charAt(i);
			
			if(!map.containsKey(ch))
			{
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()  || stack.pop() !=map.get(ch))
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args)
	{
		String str= "()";
		boolean result= tovalidparathesi(str);
		System.out.println(result);
		
	}
}