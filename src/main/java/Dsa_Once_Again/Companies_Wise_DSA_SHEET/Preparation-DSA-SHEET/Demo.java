class Test {
	void m1()
	{
		int y=10;
	}
}
class check extends Test {
	void m1()
	{
		int x=20;
	}

}
class Demo{
	public static void main(String[] args)
	{
//		Test t= new Test();
//		t.x=50;    ->Cannot find symbol
		
		Check c= new Test();
		c.y=70;
	}
}