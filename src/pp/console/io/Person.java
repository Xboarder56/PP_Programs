package pp.console.io;

public class Person 
{
	private String name;
	private int age, height;
	
	public Person()
	{
		name = "placeholder";
		age = 18;
		height = 60;
	}
	
	public Person(String newName, int newAge, int newHeight)
	{
		name = newName;
		age = newAge;
		height = newHeight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setName(String newName)
	{
		if(!name.equals(null)&& !name.equals("")){
			name = newName;
		}
	}
	
	public void setAge(int newAge)
	{
		if(age > 0 && age< 120)
		{
			age= newAge;
		}
	}

	public void setHeight(int newHeight)
	{
		if(height >1 && height <80)
		{
			height = newHeight;
		}
	}
}
