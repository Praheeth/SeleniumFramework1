package test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class seleniumWaitsDemo 
{
	static WebDriver driver ;

	public static void main(String[] args) 
	{
		seleniumWait();
	}

	public static  void seleniumWait() 
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement explicitWait = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
	   
		driver.findElement(By.xpath("//input[@name='abcd']")).click();
		driver.close();

	}
}
