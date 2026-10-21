//I want to print the Hello world 5 times through one funciton ?
class Recursion01Test
{
	public static void main(String[] args)
	{
		int n=1;
		print1(1);
	}
	//Now to create function
	static void print1(int n)
	{
		System.out.println(n); //here n=1 print
		//pha function call krega dursara function ko
		print2(2);
		
	}
	//function
	static void print2(int n)
	{
		System.out.println(n); //n=2
		//now isme call kro pritn3 ko
		print3(3);
	}
	//function
	static void print3(int n)
	{
		System.out.println(n); //n=3
		print4(4);
	}
	//function
	static void print4(int n)
	{
		System.out.println(n); //n=4
		//now isme call kro print5 ko
		print5(5);
	}
	//function
	static void print5(int n)
	{
		//this is our last element 
		System.out.println(n); //n=5
	}

		
}