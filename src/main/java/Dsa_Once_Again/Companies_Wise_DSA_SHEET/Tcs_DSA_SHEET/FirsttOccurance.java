class FirsttOccurance {
	static int tocheckthefirstoccurance(String str, String tsr)
	{
		//outer loop from 0 to length
		for(int i=0; i<str.length()-tsr.length(); i++)
		{
			//now we should compare the char of both
			boolean found= true;
			//inner looop
			for(int j=0; j<tsr.length(); j++)
			{
				if(charAt(i+j)!=charAt(j))
				{
					found= false;
					break;
				}
			}
			//found means true
			if(found)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		String str= "leetcode";
		String tsr= "leeto";
		
		int result = tocheckthefirstoccurance(str,tsr);
	}
}