package demo;

public class ExceptionHandlingDemo 
{
	public static void main(String[] args) 
	{
		try {
			demo();
		}
		
		catch(Exception e)
		{
			System.out.println("inside catch block");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("inside finally");
		}
	}

	public static void demo()
	{

		System.out.println("Hello World");

		//int i = 1/0;
		
		throw new ArithmeticException("not valid operation");

		//System.out.println("Completed");

	}
}


