package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDempWithTestNG 
{
	WebDriver driver = null;
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setUp()
	{
		htmlReporter = new ExtentSparkReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@BeforeTest
	public void browserSetup()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chromedriver.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void test1() 
	{
		ExtentTest test1 = extent.createTest("Google Search Test One" , "This is a test to valdate Google search Functionality");	
		test1.info("Starting test Case");

		driver.get("http://www.google.com");
		test1.pass("Successfully navigated to Google search page" );

		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		test1.pass("Eneter text succesfully and clicked Enter on Keybord");

				
	}

	@Test
	public void test2() 
	{
		ExtentTest test1 = extent.createTest("Google Search Test Second" , "This is a test to valdate Google search Functionality");	
		test1.info("Starting test Case");

		driver.get("http://www.google.com");
		test1.pass("Successfully navigated to Google search page" );

		driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
		test1.fail("Eneter text succesfully and clicked Enter on Keybord");

				
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Testing Succesful");
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}
}

