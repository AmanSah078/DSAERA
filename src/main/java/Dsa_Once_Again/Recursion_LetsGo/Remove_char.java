class Remove_char {
	public static void main(String[] args)
	{
StringBuilder input = new StringBuilder("baccdah"); //this keep the input
StringBuilder output = new StringBuilder(); //This keep the result
		for(int i=0; i<input.length(); i++)
		{
			char ch= input.charAt(i);
			if(ch!='a')
			{
				//baki sb add kr do
				output.append(ch);
		
			}
			else {
	       continue;
			}
		}
		System.out.println(output);
		
	}

}