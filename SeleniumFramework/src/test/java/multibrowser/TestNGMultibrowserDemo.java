package multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultibrowserDemo 
{
	WebDriver driver = null; 
	String projectpath = System.getProperty("user.dir");
	@Parameters("browserName")
	@BeforeTest
	public void browserSetUp(String browserName)
	{
		System.out.println(browserName + " is the browser selected");
		System.out.println("Thread id: " +Thread.currentThread().getId());

		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectpath + "/driver/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
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
	public void test()
	{
		driver.get("http://www.google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
	}

	@AfterTest
	public void teraDown()
	{
		driver.close();
		System.out.println("Testing completed");
	}

}
