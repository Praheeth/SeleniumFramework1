package test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestNGIgnoreDemo 
{
	@Test
	@Ignore
	public void test1()
	{
		System.out.println("Inside Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Inside Test2");
	}
	
}
