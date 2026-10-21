class ReverseString {
//	public static void main(String[] args)
//	{
//		StringBuilder str= new StringBuider("aman");
//		System.out.println(str.reverse());
//	}
	
	static void toreverseaString(String str)
	{
		StringBuilder sb= new StringBuilder(str);
		System.out.println(sb.reverse());
	}
	public static void main(String[] args)
	{
		String str="abcd";
		 toreverseaString(str);
	}
}