package test;

import org.testng.annotations.Test;


@Test(groups = "AllTest")
public class TestNGGroupsDemo 
{
   
	@Test(groups = {"Sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups = {"Windows.Regression"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups = {"Linux.Regression"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test
	public void test4()
	{
		System.out.println("test4");
	}
}
