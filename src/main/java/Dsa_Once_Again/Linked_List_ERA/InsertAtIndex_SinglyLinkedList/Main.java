class Main {
	public static void main(String[] args)
	{
		LinkedList list= new LinkedList();
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
		list.insertFirst(50);
		list.insertFirst(60);
		list.insertAtIndex(2,45);
		
		list.display();
	}
}