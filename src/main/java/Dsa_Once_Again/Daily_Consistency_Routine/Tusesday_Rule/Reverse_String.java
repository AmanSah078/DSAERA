class Reverse_String {
static void reversestring(String str)
{
	//Let's goo
//		StringBuilder sb= new StringBuilder();  
		StringBuilder sb = new StringBuilder(str);
	    System.out.println(sb.reverse());
	
}
	public static void main(String[] args)
	{
//		String str="hello";
		reversestring("hello");
	}
}
