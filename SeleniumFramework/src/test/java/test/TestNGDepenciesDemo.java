package test;

import org.testng.annotations.Test;

public class TestNGDepenciesDemo 
{
	@Test(dependsOnGroups = {"sanity.*"})
	public void test1()
	{
		System.out.println("Inside Test1");
	}
	
	@Test(groups = "sanity1")
	public void test2()
	{
		System.out.println("Inside Test2");
	}
	
	@Test(groups = "sanity2")
	public void test3()
	{
		System.out.println("Inside Test3");
	}
}
