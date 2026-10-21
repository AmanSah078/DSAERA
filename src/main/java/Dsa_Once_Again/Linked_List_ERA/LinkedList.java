class LinkedList {
	Node head;
	public void insertFirst(int value)
	{
		//create new node
		//step-1
		//now to create the firstInsrtMethod
	
			
		//step-1
		Node newNode= new Node(value);
		
	
		//step-2
		newNode.next= head;
		
		//step-3
		
		head= newNode;
}
	
	//display method
	public void display()
	{
		//Don't move head dude otherwise referenced will be remove
		Node temp= head;
		
		//Better to use while loopp instead to use the s.o.p every time when u connect the element
		while(temp!=null)

		{
			System.out.println(temp.data);
			temp=temp.next;
			
		}
		System.out.println("null");
	}
}