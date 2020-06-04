package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoITDemo 
{
	public static void main(String[] args) throws Exception 
	{
		test();
	}

	public static void test() throws Exception
	{

		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://smallpdf.com/share-document");	 	
		
		driver.findElement(By.xpath("//button[@class='l3tlg0-0 xTa-DS']")).click();
		
        Runtime.getRuntime().exec("D:\\FileUploadscript.exe	");
		//driver.close();
		System.out.println("Testing Completed");
	}
}
