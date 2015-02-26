package pp.linkedlists.structer;

public class LinkedList
{
	//store a reference (pointer) to the first node in our list
	private static Node head;
	private int counter =0;
	
	public LinkedList()
	{
		// do nothing
	}
	
	public void add(Object newElement)
	{
		//case 1: our list is empty(head is null)
		if(head == null)
		{
			
			//"point"  head to a new node
			head = new Node(newElement, null);
			counter++;
		}
		else
		{
			// case 2: our list is not empty, so we need to find
			// the sat element in our list. 
			Node current = head;
			
			//the last node has a next field that is null,
			//so continue until we find that
			while(current.next != null)
			{
				//move current to our next node
				current = current.next;
				
				
				
			}
			
			//add my new node to the end of the list
			current.next = new Node(newElement, null);
			counter++;
		}
	}
	
	public int size()
	{
		System.out.println(counter);
		return counter;
	}
	
	public void isEmpty()
	{
		if(head == null)
		{
			//we could not successfully remove the searchValue
			System.out.println("The list is empty");
		}
		else
		{
			System.out.println("The list has objects in it.");
		}
	}
	
	public Object get(int index)
	{
		
		//make sure we have a valid index
		if(index < counter)
		{
			//remap the head to a node called current
			Node current = head;
			
			//loop the index for 4
			for(int i=0; i<=index; i++)
			{
				// if the index = the last loop through
				if(index == i)
				{
					// print the current data in the node.
					//System.out.println(current.data);
					return current.data;
				}
				else
				{
					//Keep passing the current to the next
					// over and over and over.
					current = current.next;
				}
			}
			return null;
		}
		else
		{
			System.out.println("The index was not found!");
			
			return null;
		}
	}
	
	public void insertAt(int index, Object newElement)
	{
		Node current = head;
		
		for(int i=0; i < index - 1; i++)
		{
			current = current.next;
		}
		
		//add my new node to the end of the list
		current.next = new Node(newElement, current.next);
	}
	
	public void printList()
	{
		//print out the data in each node of the list
		Node current = head;
		
		//continue as long aswe have a node(its's not null)
		while(current != null)
		{
			//print out the data of the current node
			System.out.println(current.data);
			
			//move to our next node!
			current = current.next;
		}
	}
	
	public boolean remove(Object searchValue)
	{
		//NOTICE: my return type is boolean (true - success, flase - failure)
		
		//case 1: empty list
		if(head == null)
		{
			//we could not successfully remove the searchValue
			return false;
		}
		else if(head.data.equals(searchValue))
		{
			//move head to our second node, and the first 
			// will be lost to the java machine!?!?!??!?!?
			head = head.next;
			counter--;
			return true;
		}
		else
		{
			Node current = head;
			
			
			//loop until we reach the end of our list (the seachVlaue is not found
			//pr we find the node right before the one we're removing
			while(current.next !=null && 
					!current.next.data.equals(searchValue))
			{
				current = current.next;
				
				
			}
			
			//have we found our searchValue now?
			
			// did we not found our value?
			if(current.next == null)
			{
				///we didn't find it
				return false;
			}
			else
			{
				//current is at the node before the one we're removing
				current.next = current.next.next;
				counter--;
				return true;
			}
		}
	}
	
	private static class Node
	{
		private Object data;
		private Node next; //pointer to the next node in my list
		
		public Node(Object data, Node next)
		{
			this.data = data;
			this.next = next;
		}

		public Object getData()
		{
			return data;
		}

		public void setData(Object data)
		{
			this.data = data;
		}

		public Node getNext()
		{
			return next;
		}

		public void setNext(Node next)
		{
			this.next = next;
		}
		
		@Override
		public String toString()
		{
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}

}
