package pp.webRegistration;

public class WebRegistration 
{
	private String username, password, confirmPassword, email;

	public WebRegistration(String username, String password, String confirmPassword, String email) 
	{
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.email = email;
		
		if(!password.equals(confirmPassword))
		{
			throw new RuntimeException("Passwords do not match!");
		}
		
		if(!username.equals(" ") || !username.equals(null))
		{
			throw new RuntimeException("A terminator has been sent back in time to kill you");
		}
		
		if(!email.contains("@") || !email.contains("."))
		{
			throw new RuntimeException("Not valid email!");
		}
	}
	
	public String getUserName()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getConfirmPassword()
	{
		return confirmPassword;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String toString()
	{
		return username + " " + password + " " + confirmPassword + " " +email;
	}

}
