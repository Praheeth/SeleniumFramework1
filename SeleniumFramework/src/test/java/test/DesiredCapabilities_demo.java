package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCapabilities_demo {

	
		public static void main(String[] args)
		{
			googleSearch();
		}


		public static void googleSearch() 
		{
			String projectpath = System.getProperty("user.dir");
			System.setProperty("webdriver.ie.driver", projectpath + "/driver/IEdriver/IEDriverServer.exe");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("ignoreProtectedModeSettings", true);
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.merge(caps);
			WebDriver driver = new InternetExplorerDriver(options);
			
			driver.get("http://www.google.com");
			driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
			//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.ENTER);
			System.out.println("Testing Succesful");
			driver.close();
		}
	}
