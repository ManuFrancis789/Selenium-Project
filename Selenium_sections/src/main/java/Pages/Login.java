 package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/////////POM(Page Object Model) with data driven method
public class Login 
{
	WebDriver driver;
	By emailIdXpath = By.xpath("//input[@name=\"email\"]");
	By passwordXpath = By.xpath("//input[@name=\"pass\"]");
	By loginXpath = By.xpath("//button[@name=\"login\"]");
	
	public void typeEmailId(String emailId)
	{
	driver.findElement(emailIdXpath).sendKeys(emailId);
	}
	
	public void typePassword(String password)
	{
	driver.findElement(passwordXpath).sendKeys(password);	
	}

	public void loginClick()
	{
	driver.findElement(loginXpath).click();
	}
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}
}
