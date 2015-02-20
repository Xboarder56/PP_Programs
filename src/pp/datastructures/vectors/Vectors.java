package pp.datastructures.vectors;

import java.util.Vector;

public class Vectors
{

	public static void main(String[] args)
	{
		Vector<Integer> vectorOne = new Vector<Integer>();
		
		//1rd Part
		for(int i = 1; i<=100; i++){
			vectorOne.add(i);
		}

		for(int i = 0; i<vectorOne.size(); i++){
			System.out.print(i + ", ");
		}
		System.out.println();
		
		//2rd Part
		for(int i=0; i< vectorOne.size(); i++){
			if(vectorOne.get(i)%2 ==0){
				vectorOne.remove(i);
			}
		}
		for(int i = 0; i<vectorOne.size(); i++){
			System.out.print(vectorOne.get(i) + ", ");
		
		}
		System.out.println();
		
		//3rd PartA
		for(int i=vectorOne.size()-1; i>=0; i-= 2)
		{
			vectorOne.remove(i);
		}
		
		for(int i = 0; i<vectorOne.size(); i++){
			System.out.print(vectorOne.get(i) + ", ");
		
		}
		System.out.println();

		
		//3rd PartB
		System.out.println("Cooler solution");
		
		for(int i=0; i< vectorOne.size(); i++){
			vectorOne.removeElementAt((i));
		}
		
		for(int i = 0; i<vectorOne.size(); i++){
			System.out.print(vectorOne.get(i) + ", ");
		}
		System.out.println();
		
		
	}

}
