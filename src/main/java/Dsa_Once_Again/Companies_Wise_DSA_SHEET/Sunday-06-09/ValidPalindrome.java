class ValidPalindrome {
	static boolean ispalindrome(String str)
	{
		

//To convert all the String into Lower case
str = str.toLowerCase();

//To remove the specific char
//str = str.replaceAll("[^a-z,0-9]", " ");
str = str.replaceAll("[^a-z0-9]", "");
int i = 0;
int j = str.length() - 1;

while(i < j)
{
    if(str.charAt(i) != str.charAt(j))
    {
        return false;
    }
    i++;
    j--;
}
return true;
}
public static void main(String[] args)
{
	//String str= "race a car";
	String str= "A man, a plan, a canal: Panama";
	boolean result= ispalindrome(str);
	System.out.println(result);
}

	
}