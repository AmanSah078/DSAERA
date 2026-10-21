class Animal {
}
	//child class
	class Dog extends Animal()
	{
		
	}
	class Cat extends Animal()
	{
		
	}



class Test {
	
 void m1()
		
	{
		int y=10;
	}
}
class check extends Test()
{
	void m2()
	{
		int x=20;
	}
}
class Test {
	public static void main(String[] args)
	{
		Test t=new check()
		{
			t.x();
		}
	}
}