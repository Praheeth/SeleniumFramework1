package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGParametersDemo 

{
	
	@Test
	@Parameters("MyName")
	public void test(String MyName)
	{
		System.out.println("The name is "+ MyName);
	}
}
