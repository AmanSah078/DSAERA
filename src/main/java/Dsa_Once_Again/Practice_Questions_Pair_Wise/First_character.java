class First_character {
	static void findthefirstuniquechar(String str)
	{
		
		//But we have to find the frequency dude
		int[] arr= new int[26];
		//lloop i shoulid use dude
		for(int i=0; i<str.length(); i++)
		{
			//to change the string in the form in the char
			char ch= str.charAt(i);
			//it is used to find the freq of every char
			arr[ch-'a']++;
		}
		
		//this looop is used to print the unique char and immediately we havt to topst
		
		for(int j=0; j<str.length(); j++)
		{
			char ch=str.charAt(j);
			
			if(arr[ch - 'a'] == 1)
			{
				System.out.println(j);
				return;
			}
		}
		
	}
	public static void main(String[] args)
	{
		String str="leetcode";
		findthefirstuniquechar(str);
	}
}