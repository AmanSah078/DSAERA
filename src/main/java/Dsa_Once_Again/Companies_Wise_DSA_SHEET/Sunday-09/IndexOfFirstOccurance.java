class IndexOfFirstOccurance {
	static int indexfirstoccr(String str, String tsr)
	{
		for(int i=0; i<str.length()-tsr.length(); i++)
		{
			//char ch= str.charAt(i);
		boolean found = true;
			//now inner loop
			for(int j=0; j<tsr.length(); j++)
			{
				
			if(str.charAt(i+j)!=tsr.charAt(j))
			{
				found=false;
				break;
			}
			}
			if(found){
			return i;	
			}
		}
		return -1;
		
	}
	public static void main(String[] args)
	{
		String str= "sadbutsad";
		String tsr= "sad";
		int result= indexfirstoccr(str,tsr);
		System.out.println(result);
	}
}