package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestNGListeners.MyRetry;

public class TestNGFailedRetryDemo 
{
	@Test
	public void test1()
	{
		System.out.println("Inside Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Inside Test2");
		//int i = 1/0;
	}
	
	@Test(retryAnalyzer = MyRetry.class )
	public void test3()
	{
		System.out.println("Inside Test3");
		Assert.assertTrue(false);
	}
}
