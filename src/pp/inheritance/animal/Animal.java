package pp.inheritance.animal;

public class Animal 
{
	private String type;
	private boolean gender;
	private String genderType;
	
	public Animal(String type, boolean gender)
	{
		this.type = type;
		this.gender = gender;
	}
	
	public String getType()
	{
		return type;
		
	}
	
	public boolean getGender()
	{
		return gender;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void setGender(Boolean gender)
	{
		this.gender = gender;
		
	}
	
	public String toString()
	{
		return "Animal Type: " + type + ", Gender: " + gender;
	}
	

}
