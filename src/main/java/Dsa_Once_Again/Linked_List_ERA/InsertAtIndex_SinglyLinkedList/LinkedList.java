//Let's Gooo
class LinkedList {
	Node head;
	
//Let's take the method 
	public void insertAtIndex(int index, int value)
	{
		//need to creaet the new node
		Node newNode = new Node(value);
		
		if(index==0)
		{
			insertFirst(value);
//			NewNode.next= head;
//			head= newNode;
			return;
		}
		
		//Now to create the Temporary Pointer
		Node temp= head;
		
		//Move temop till index-1
		
		for(int i=0; i<index-1; i++)
		{
			temp=temp.next;
		}
		//Now connect with new Node with next node
		NewNode.next= temp.next;
		
		//Connect previous node with new node
		temp.next= newNode;
		
	}
	
	//Now to display
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
		
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
		
	}
