package pp.recursion;

public class RecursionNumbers 
{

	public static void main(String[] args) 
	{
		counter(10);
		printMultiplesOfThree(19);
		printMultiplesOfThree(20);
		printMultiplesOfThree(18);
		
		System.out.println("Sum -1 (6): " + evenSumDown(6));
		//System.out.println("Sum -1 (5): " + evenSumDown(5));
		stringPrint("Test one two three");
	}
	
	public static void counter(int number)
	{
		if(number == 0)
		{
			System.out.println();
			return;
		}
		else
		{
			//approach our base case and make our recursive call
			int result = (number -1);
			System.out.print(" " + number);
			
			counter(result);
		}
	}
	

	public static void printMultiplesOfThree(int number)
	{
		
		if(number%3!=0)
		{
			if(number%3 == 1)	
			{
				number-=1;
				
			}
			else if(number%3 ==2){
				number-= 2;
				
			}
			
		}
		if (number <= 3)
		{
			System.out.println(number);
			System.out.println();
			return;
		}
		
		else
		{
			//Print the current number
			System.out.println(number);
			
			//approach my base, case, and recurse
			number -=3;
			printMultiplesOfThree(number);
			
			
		}
		
		
	}
	
	public static int evenSumDown(int number)
	{
		if(number%2 !=0){
			throw new IllegalStateException("Even numbers please!");
		}
		if(number <=0)
		{
			return number;
		}
		else
		{
			int result = number + evenSumDown(number -2);
			
			return result;
		}
	}
	
	public static void stringPrint(String stuff)	
	{
		if(!stuff.contains(" ")) // are there no spaces?
		{
			System.out.println(stuff);
			return;
		}
		else
		{
			//split up my word and the rest of our sentence
			int spaceIndex = stuff.indexOf(" ");
			String word = stuff.substring(0, spaceIndex);
			String remainingString = stuff.substring(spaceIndex +1);
			
			System.out.println(word);
			stringPrint(remainingString);
		}
	}
	
}
