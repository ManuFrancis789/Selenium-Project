package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GroceryRegister
{
	WebDriver driver;
	By xpathRegister = By.xpath("//a[text()=\"Register\"]");
	By xpathFirstName = By.xpath("//input[@id=\"input-firstname\"]");
	By xpathLastName = By.xpath("//input[@id=\"input-lastname\"]");
	By xpathEmail = By.xpath("//input[@id=\"input-email\"]");
	By xpathTelephone = By.xpath("//input[@id=\"input-telephone\"]");
	By xpathFax = By.xpath("//input[@id=\"input-fax\"]");
	By xpathCompany = By.xpath("//input[@id=\"input-company\"]");
	By xpathAddress1 = By.xpath("//input[@id=\"input-address-1\"]");
	By xpathAddress2 = By.xpath("//input[@id=\"input-address-12\"]");
	By xpathCity = By.xpath("//input[@id=\"input-city\"]");
	By xpathPostcode = By.xpath("//input[@id=\"input-postcode\"]");
	By xpathPassword = By.xpath("//input[@id=\"input-password\"]");
	By xpathConfirmPassword = By.xpath("//input[@id=\"input-confirm\"]");
	By xpathSelectCountry = By.xpath("//select[@id=\"input-country\"]");
	
	public void typeFirstName(String text)
	{
		driver.findElement(xpathFirstName).sendKeys(text);
		
	}
	
	public void typeLastName(String text)
	{
		driver.findElement(xpathLastName).sendKeys(text);
	
	}
	public void typeEmail(String text)
	{
		driver.findElement(xpathEmail).sendKeys(text);
	}
	
	public void typeTelephone(String text)
	{
		driver.findElement(xpathTelephone).sendKeys(text);
	
	}
	
	public void typeFax(String text)
	{
		driver.findElement(xpathFax).sendKeys(text);
	
	}
	
	public void typeCompany(String text)
	{
		driver.findElement(xpathCompany).sendKeys(text);
	
	}
	
	public void typeAddress1(String text)
	{
		driver.findElement(xpathAddress1).sendKeys(text);
	}
	
	public void typeAddress2(String text)
	{
		driver.findElement(xpathAddress2).sendKeys(text);
	
	}
	
	public void typeCity(String text)
	{
		driver.findElement(xpathCity).sendKeys(text);
	
	}
	
	public void typePostcode(String text)
	{
		driver.findElement(xpathPostcode).sendKeys(text);
	
	}
	
	public void typePassword(String text)
	{
		driver.findElement(xpathPassword).sendKeys(text);
	
	}
	
	public void typeCofirmPassword(String text)
	{
		driver.findElement(xpathConfirmPassword).sendKeys(text);
	
	}
	
	public void selectCountry()
	{
		WebElement selectCountry = driver.findElement(xpathSelectCountry);
		Select selectobj = new Select(selectCountry);
		  selectobj.selectByVisibleText("India");
	}
	public void clickRegister()
	{
		driver.findElement(xpathRegister).click();	
	}
	
	public GroceryRegister(WebDriver driver)
	{
		this.driver=driver;
	}
	
}
