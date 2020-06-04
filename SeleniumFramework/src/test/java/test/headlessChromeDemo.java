package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessChromeDemo 
{
	public static void main(String[] args) 
	{
	test();	
	}
	public static void test()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");	
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		System.out.println("Completed");
		
	}
}
