package pp.console.io;

import java.util.Scanner;

public class PersonIO 
{
	private static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		Person person = new Person();
		
		intro();
		repeat();
		console.close();
		
	}

	public static void intro()
	{
		
		
		System.out.println("Welcome to the  \"Create a Person\"  console program!");
		
		System.out.println("Enter our name (first and last): ");
		String name = console.nextLine(); //clears the prompt (to skip enter key)
		
		System.out.println("Enter your age (in years): ");
		int age = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();
		
		System.out.println("Enter your height (in inches): ");
		int height = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();
		
		System.out.println("Your Person object: " + name +", " + age + " years old, "  + height +" inches tall " );
		
	}
	public static void repeat()
	{
		System.out.println("Create another Person object?(continue or exit)");
		String input = console.nextLine(); //clears the prompt (to skip enter key)
		
		if(input.equalsIgnoreCase("continue"))
		{
			intro();
			repeat();
		}
		
		else if (input.equalsIgnoreCase("exit"))
		{
			return;
		}
	}

}
