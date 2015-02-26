package pp.linkedlists.structer;



public class MainDriver
{

	public static void main(String[] args)
	{
		LinkedList test = new LinkedList();
		test.isEmpty();
		test.add("Fight club");
		test.add("Silence of the Lambs");
		test.add("Blazing Saddles");
		test.add("Requiem of a dream");
		test.add("test");
		//test.remove("Fight club");
		test.size();
		
		test.insertAt(3, "placeholder");
		
		test.printList();
		
		

		//System.out.println(test.get(2));
//		test.remove("test");

//		test.printList();
	}

}
