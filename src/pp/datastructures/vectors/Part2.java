

import java.util.ArrayList;

public class Part2
{

	public static void main(String[] args)
	{
		ArrayList<Integer> ArrayListOne = new ArrayList<Integer>();

		for(int i = 1; i<=100; i++){
			ArrayListOne.add(i);
		}

		for(int i = 0; i<ArrayListOne.size(); i++){
			System.out.print(i + ", ");
		}
		System.out.println();

		for(int i=0; i< ArrayListOne.size(); i++){
			if(ArrayListOne.get(i)%2 ==0){
				ArrayListOne.remove(i);
			}
		}
		for(int i = 0; i<ArrayListOne.size(); i++){
			System.out.print(ArrayListOne.get(i) + ", ");

		}
		System.out.println();


		//3rd thing
		for(int i=ArrayListOne.size()-1; i>=0; i-= 2)
		{
			ArrayListOne.remove(i);

		}

		for(int i = 0; i<ArrayListOne.size(); i++){
			System.out.print(ArrayListOne.get(i) + ", ");

		}
		System.out.println();

		//Part 2
		ArrayList<String> favoriteWords = new ArrayList<String>();

		favoriteWords.add("vacation");
		favoriteWords.add("college");
		favoriteWords.add("coffee");
		favoriteWords.add("pizza");
		favoriteWords.add("beer");
		favoriteWords.add("wife");
		favoriteWords.add("horror");
		favoriteWords.add("whiskey");
		favoriteWords.add("sleeping");
		favoriteWords.add("breakfast");

		for(int i = 0; i< favoriteWords.size(); i++){
			if(favoriteWords.get(i).length()>5){
				System.out.println(favoriteWords.get(i));
			}
		}
		System.out.println();
		for(int i = 0; i<favoriteWords.size(); i++){
			if(favoriteWords.get(i).contains("a")){
				System.out.println(favoriteWords.get(i));
			}
		}
		System.out.println();

		for(int i = favoriteWords.size() -1; i>=0; i--){
			favoriteWords.remove(i);
		}
		System.out.println(favoriteWords.size());
	}

}
