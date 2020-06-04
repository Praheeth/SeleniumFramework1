package TestNGListeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenersDemo 

{
	@Test
	public void test1()
	{
		System.out.println("i am inside test1");
	}
	@Test
	public void test2()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name='abcd']")).sendKeys("Selenium");
		driver.close();
	}
	@Test
	public void test3()
	{
		System.out.println("i am inside test3");

	}
}
