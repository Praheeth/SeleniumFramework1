package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo 
{
	static WebDriver driver;

	public static void main(String[] args) throws Exception
	{
		fluentWait();
	}
	public static void fluentWait() throws Exception
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd" , Keys.ENTER);
		//driver.findElement(By.xpath("//h3[contains(text(),'ABCD - NIMH Data Archive - NIH')]")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
	            .pollingEvery(Duration.ofMillis(500))
	            .ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() 
		{
			public WebElement apply(WebDriver driver) 
			{
				WebElement linkElement = driver.findElement(By.xpath("//h3[contains(text(),'ABCD - NIMH Data Archive - NIH')]"));
				
				if(linkElement.isEnabled())
				{
					System.out.println("Element Found");
				}
				return linkElement;
			}
			
		});

        element.click();
		Thread.sleep(4000);
		driver.close();
	}


}
