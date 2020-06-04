package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest 
{
  private static WebDriver driver = null;
	public static void main(String[] args) 
	{
		googleSearchTest();
	}
	
	public static void googleSearchTest()
	{
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chromedriver.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		GoogleSearchPageObjects pageobjects = new GoogleSearchPageObjects(driver);
		
		pageobjects.setTextInSearchBox("Corona");
		driver.close();
		
	}
}
