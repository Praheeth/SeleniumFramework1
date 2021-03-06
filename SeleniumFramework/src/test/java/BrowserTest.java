import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest 

{

	
	public static void main(String[] args) throws InterruptedException 
	
	{
		String projectpath = System.getProperty("user.dir");
		
		//System.out.println("projectpath is " + projectpath);
		
		//System.setProperty("webdriver.gecko.driver", projectpath + "/driver/geckodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", projectpath + "/driver/IEdriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		
		List<WebElement> InpuWebElement = driver.findElements(By.xpath("//Input"));
		 
		int count = InpuWebElement.size();
		
		System.out.println("List of input elements : " + count);
	
		System.out.println("The title is : " + driver.getTitle()); 
		
		Thread.sleep(3000);
		driver.close();
	}
}
