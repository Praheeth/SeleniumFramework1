package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo

{
	String projectpath = System.getProperty("user.dir");
	WebDriver driver = null;
	public static String browserName = null;

	@BeforeTest
	public void browserSetup()
	{
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chromedriver.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectpath + "/driver/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver", projectpath + "/driver/IEdriver/IEDriverServer.exe");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("ignoreProtectedModeSettings", true);
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.merge(caps);
			driver = new InternetExplorerDriver(options);
		}
	}

	@Test
	public void googleSearch() 
	{
      
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.ENTER);

	}

	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		//driver.quit();
		System.out.println("Testing Successful");
		PropertiesFile.setProperties();

	}
}
