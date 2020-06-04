package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test1_GoogleSearch
{
	public static void main(String[] args)
	{
		googleSearch();
	}


	public static void googleSearch() 
	{
		String projectpath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chromedriver.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.ie.driver", projectpath + "/driver/IEdriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.ENTER);
		System.out.println("Testing Succesful");
		driver.close();
	}
}
