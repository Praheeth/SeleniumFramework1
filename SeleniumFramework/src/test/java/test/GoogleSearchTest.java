package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest
{

	private static WebDriver driver = null;
	public static void main(String[] args)
	{
		googleSearch();
	}


	public static void googleSearch() 
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chromedriver.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", projectpath + "/driver/IEdriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();

		driver.get("http://www.google.com");
		GoogleSearchPage.textbox_Search(driver).sendKeys("Selenium" , Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.ENTER);
		System.out.println("Testing Succesful");
		driver.close();
	}
}
