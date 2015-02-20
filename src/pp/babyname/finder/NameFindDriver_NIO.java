package pp.babyname.finder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class NameFindDriver_NIO 
{
	private static final Scanner console = new Scanner(System.in);
	private static boolean matchfound, matchfound2, matchfound3;

	public static void main(String[] args)
	{
		try 
		{
			String content = new String(Files.readAllBytes(Paths.get("babynames.txt")));
			
			Files.write(Paths.get("movies.txt"), content.getBytes(), StandardOpenOption.APPEND);
			
			
			
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the name to find in the list: ");
			String name1 = console.nextLine(); //clears the prompt (to skip enter key)
			
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the name to find in the list: ");
			String name2 = console.nextLine(); //clears the prompt (to skip enter key)
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the name to find in the list: ");
			String name3 = console.nextLine(); //clears the prompt (to skip enter key)
			
			if(content.contains(name1))
			{
				matchfound = true;
			}
			
			if(content.contains(name2))
			{
				matchfound2 = true;
			}
			if(content.contains(name3))
			{
				matchfound3 = true;
			}
			
			System.out.println(name1 + " is found? "+ matchfound);
			System.out.println(name2 + " is found? "+ matchfound2);
			System.out.println(name3 + " is found? "+ matchfound3);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	


}
