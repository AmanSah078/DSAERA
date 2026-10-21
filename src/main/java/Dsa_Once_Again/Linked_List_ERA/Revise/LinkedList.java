class LinkedList {
	
	//intially
	Node head;
	//Create the method dude->insert 20
	public void insertFirst(int value)
	{
		//to create the new node
		Node newNode = new Node(value);
		
		//Now connect to node to node
		newNode.next= head;
		
		//so our head will be?
		head= newNode;
	}
	
	//Now to handle the display
	
	//we cannot move the head
	public void display()
	{
	Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			 
		    temp= temp.next;
		}
		System.out.println("null");
	}
	
}