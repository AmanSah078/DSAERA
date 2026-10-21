class LongestCommonPrefix {
	static String  findthelongestcommon(String[] str)
	{
		List<String> list= Arrays.asList("flower","flask","fly");
	//Now to find the min
	int minlength=Integer.MAX_VALUE;
	
		//now take the min from the string
		for(int i=0; i<str.length; i++)
		{
			/*min=Math.min(minlength,list.get(i).length());*/
			minlength= Math.min(minlength,list.get(i).length());
			
		}
	//use here String Builder to store the New String value
		StringBuilder result= new StringBuilder();
		
 //Let's use the Outer looop
		for(int i=0; i<min.length; i++)
		{
			char current= list.get(i).charAt(0);
			
			//Let's use the outerloop
			for(int j=1; j<list.length; j++)
			{
				if(list.get(j).charAt(0)!=current)
				{
					return result.toString();
				}
				else {
					return result.append();
				}
			}
		}
		return result.toString();
		
	}
	publ{ic static void main(String[] args)
	String str={"flower","flight","flask"};
   String result= findthelongestcommon(str);
	System.out.println(result);
    
		 }
}