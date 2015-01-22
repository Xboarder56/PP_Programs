package pp.webRegistration;

public class WebRegistrationDriver {

	public static void main(String[] args) 
	{
		try
		{
			WebRegistration webReg = new WebRegistration(" ", " ", " ", " ");
			System.out.println(webReg);
		}
		
		catch(RuntimeException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("Bluescreening now!!!!");
			System.exit(0);
		}
	}

}
