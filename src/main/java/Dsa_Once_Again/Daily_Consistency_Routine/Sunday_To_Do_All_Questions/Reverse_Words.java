class Reverse_Words {
static void findthereversewords(String[] str)
{
	//dude how u can directly modify are u comedy me because string is immutabe then there is not any possiblity to modify like this 
	//It's possible when u will be store inside the var
	//str.trim();
	str=str.trim();
//	str.toLowerCase();
	str=str.toLowerCase();
	
	// Split the string into words using space
String[] words = str.split("\\s+");
   // Traverse the array from last word to first word
        for (int i = words.length - 1; i >= 0; i--) {

            // Print the current word
            System.out.print(words[i]);

}
	public static void main(String[] args)
	{
		String[]str= ["i","Love","You"];
		findthereversewords(str);
	}
}