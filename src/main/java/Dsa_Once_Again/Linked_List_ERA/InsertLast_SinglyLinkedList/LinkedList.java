class LinkedList {
	Node head;
	//Now to create the 1st method?
public  void insertLast(int value)
	{
		//create new node
	Node newNode = new Node(value);
		
		//To check head is empty or not
		//if empty
		if(head==null)
		{
	    head= newNode;
		return;
		}
		//if not empty
		//we cannot move the head thats why we r declare inside the temp
		//Means if head(temp) is not empty
		Node temp= head;
		
		while(temp.next!=null)
		{
			//We r going to pointing to the next 
			temp= temp.next;
		}
		//when last node connect with null then ???
		temp.next= newNode;
	}
//Now need to use the display method
	public  void display()
	{
		Node temp= head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp= temp.next;
			
		}
		System.out.println("null");
	}
}