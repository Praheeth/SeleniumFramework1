package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ExcelDataProvider 
{
	
	String projectpath = System.getProperty("user.dir");
	WebDriver driver;
	
	@BeforeTest
	public void browserSetup()
	{
		System.setProperty("webdriver.chromedriver.driver", projectpath + "/driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

	}


	@Test(dataProvider = "test1data")
	public void test1(String username,String password)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	@AfterTest
	public void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.close();
		System.out.println("Completed");

	}

	@DataProvider(name= "test1data")
	public Object[][] getData() 
	{
		Object data[][] = testData(projectpath + "/excel/Data.xlsx", "Sheet1");
		return data;
	}

	public static Object[][] testData(String excelPath , String sheetName)
	{
		excelUtils excel = new excelUtils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount-1][colCount];

		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<colCount; j++)
			{
				String cellData = excel.getCellDataString(i,j);
				//System.out.print(cellData + "  |  ");
				data[i-1][j] = cellData;
			}
			//System.out.println();
		}
		return data;
	}

}
