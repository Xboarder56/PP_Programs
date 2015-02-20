package pp.datastructures.vectors;

import java.util.Vector;

public class VectorsPart2
{

	public static void main(String[] args)
	{
		Vector<String> favoriteWords = new Vector<String>();

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