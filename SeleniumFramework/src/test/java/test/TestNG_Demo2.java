package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2

 {
	 WebDriver driver = null;
	
	 @BeforeTest
	public void browserSetup()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chromedriver.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
     
	 @Test
	public  void googleSearch2() 
	{
				
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.ENTER);
		
	}
	
	 
	 @Test
		public  void googleSearch3() 
		{
					
			driver.get("http://www.google.com");
			driver.findElement(By.name("q")).sendKeys("UFT",Keys.ENTER);
			//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.ENTER);
			
		}
	 @AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Testing Succesful");
		
	}
}
