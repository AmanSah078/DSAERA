class First_Unique_char {
	static char findthefirstuniquechar(String str)
	{
		int[] arr= new int[26];
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			arr[ch-'a']++;
		}
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
		//I think this u can only use to
	//  if(arr[i]==1)
		if(arr[ch-'a']==1)
	  {
		 //to return index no
		//return i;
			//To return char value
			return str.charAt(i);
	  }
	}
		return '\0';
	}
		public static void main(String[]args)
		{
			String str= "racecar";
			char result=findthefirstuniquechar(str);
			System.out.println(result);
			
		}
	}