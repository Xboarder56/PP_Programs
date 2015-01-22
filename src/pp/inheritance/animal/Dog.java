package pp.inheritance.animal;

public class Dog extends Animal 
{
	private String breed;
	private boolean gender;
	private String genderType;
	
	public Dog(String breed, boolean gender)
	{
		super("Dog", gender);
		this.breed = breed;
		this.gender = gender;
	}

	public String getBreed(String breed)
	{
		return breed;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public String toString()
	{
		if(gender==false)
		{
			genderType = "male";
		}
		
		else if(gender==true)
		{
			genderType = "female";
		}
		
		return "Animal Type: " + getType() + ", Gender: " + genderType + ", Breed: " + breed;
	}
}
