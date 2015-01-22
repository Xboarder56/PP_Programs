package pp.inheritance.animal;

public class AnimalDriver 
{

	public static void main(String[] args) 
	{
		Cat cat = new Cat("Rainbow", false);
		Dog dog = new Dog("German Shepard", true);
		System.out.println(cat.toString());
		System.out.println(dog.toString());
	}

}
