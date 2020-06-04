package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects 
{
	WebDriver driver = null;

	public GoogleSearchPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	By textbox_search = By.name("q");

	By button_search = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");

	public void setTextInSearchBox(String text)
	{

		driver.findElement(textbox_search).sendKeys(text , Keys.ENTER);
	}
	
	public void clickSearchButton()
	{
		driver.findElement(button_search).click();
	}
}
