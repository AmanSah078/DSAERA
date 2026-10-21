class FindFirstOccurance {
	static int tofindthefirstoccurance(String str, String tsr)
    {
	//find the length
		for(int i=0; i<=str.length()-tsr.length(); i++)
		{
			boolean found=true;
			
	//now run the loop till second
	    for(int j=0; j<tsr.length(); j++)
		{
			//Now let's do the comparing
			
			if(str.charAt(i+j)!=tsr.charAt(j))
			{
				found = false;
				break;
			}
		}
			if(found)
			{
				return i;
			}
			
		}
		
		return -1;
	}
	public static void main(String[] args)
	{
		String str= "sadbutsad";
		String tsr= "sad";
		int result= tofindthefirstoccurance(str,tsr);
		System.out.println(result);
	}
}