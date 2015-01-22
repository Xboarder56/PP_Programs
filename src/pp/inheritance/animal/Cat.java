package pp.inheritance.animal;

public class Cat extends Animal
{
	private String hairColor;
	private boolean gender;
	private String genderType;
	
	public Cat(String hairColor, boolean gender)
	{
		super("Cat", gender);
		this.hairColor = hairColor;
		this.gender = gender;
	}
	
	public String getHairColor(String hairColor)
	{
		return hairColor;
	}

	public void setHairColorType(String hairColor)
	{
		this.hairColor = hairColor;
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
		
		return "Animal Type: " + getType() + ", Gender: " + genderType + ", Hair Color: " + hairColor;
	}
	
}
