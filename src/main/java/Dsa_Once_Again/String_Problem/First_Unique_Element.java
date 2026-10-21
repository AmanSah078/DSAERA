package Dsa_Once_Again.String_Problem;

class First_Unique_Element {
	static int findunique(String str)
	{
		//1.
		int[] arr= new int[26];
		for(int i=0; i<str.length(); i++)
		{
		char ch= str.charAt(i);
		arr[ch-'a']++;   //here freq we find but ?
		}
		for(int j=0; j<str.length(); j++)
		{
			char ch = str.charAt(j);
		
			if(arr[ch - 'a'] == 1)
			{
				//i want index number not index value bhai
				return j;
		}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		String str="leetcode";
		int result=findunique(str);
		System.out.println(result);
	}
	
	}
