package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo 
{
  private static WebDriver driver = null;
	
  public static void main(String[] args) 
	{
	  ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent.html");
	  
		// create ExtentReports and attach reporter(s)
	    ExtentReports extent = new ExtentReports();	
		extent.attachReporter(htmlReporter);
		
	  
		//ExtentReports extent = new ExtentReports(System.getProperty("user.dir") +"/test-output/MyOwnReport.html",true);
	
        
		ExtentTest test1 = extent.createTest("Google Search Test One" , "This is a test to valdate Google search Functionality");
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chromedriver.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.info("Starting test Case");
		
		driver.get("http://www.google.com");
		test1.pass("Successfully navigated to Google search page" );
		
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		test1.pass("Eneter text succesfully and clicked Enter on Keybord");
		
		driver.close();
		test1.pass("Successfully closed the Browser");
		
		driver.quit();
		
		test1.info("Ending test case");
		
		extent.flush();
		
		System.out.println("Testing Succesful");
		
		
	}

}
