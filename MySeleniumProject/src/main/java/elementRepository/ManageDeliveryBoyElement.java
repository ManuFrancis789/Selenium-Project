package elementRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityRepository.GeneralUtilities;

public class ManageDeliveryBoyElement 
{
	WebDriver driver;
	GeneralUtilities utilobj = new GeneralUtilities();

	@FindBy(xpath="(//a[@class='small-box-footer'])[8]")
	WebElement manageDeliveryBoy;
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement newBtn ;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement nameTextBox ;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement emailTextBox;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	WebElement phoneNumberTextBox ;
	
	@FindBy(xpath="//textarea[@id='address']")
	WebElement addressTextBox ;
	
	@FindBy(xpath="(//input[@class='form-control'])[4]")
	WebElement userNameTextBox;
	
	@FindBy(xpath="(//input[@class='form-control'])[5]")
	WebElement passwordTextBox ;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveButton;
	
	@FindBy(xpath="//button[@class='close']")
	WebElement alert;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchButton ;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement searchNameTextBox ;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement searchEmailTextBox ;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	WebElement searchPhoneNumberTextBox;
	
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-danger']")
	WebElement searchSubmitButton;
	
	@FindBy(xpath="//a[@class='btn btn-default btn-fix']")
	WebElement resetButton ;
				
	@FindBy(xpath="(//a[@class='btn btn-sm btn btn-danger btncss'])[1]")
	WebElement deleteButton ;
	
	
	public void clickManageDeliveryBoy()
	{
		manageDeliveryBoy.click();
	}
	
	public void clickNewButton()
	{
		newBtn.click();
	}
	
	public void typeName(String text)
	{
		nameTextBox.sendKeys(text);
	}
	
	public void typeEmail(String text)
	{
		emailTextBox.sendKeys(text);
	}
	
	public void typePhoneNumber(String text)
	{
		phoneNumberTextBox.sendKeys(text);
	}
	
	public void typeAddress(String text)
	{
		addressTextBox.sendKeys(text);
	}
	
	public void typeUsername(String text)
	{
		userNameTextBox.sendKeys(text);
	}
	
	public void typePassword(String text)
	{
		passwordTextBox.sendKeys(text);
	}
	
	public void clicksave()
	{
		saveButton.sendKeys(Keys.ENTER);
	}
	
	public void clickAlert()
	{
		alert.click();
	}
	
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	public void typeNameSearchTextBox(String text)
	{
		searchNameTextBox.sendKeys(text);
	}
	
	public void typeEmailSearchTextBox(String text)
	{
		searchEmailTextBox.sendKeys(text); 
	}
	
	public void typePhoneNumberSearchTextBox(String text)
	{
		searchPhoneNumberTextBox.sendKeys(text);
	}
	
	public void clickSearchSubmitbutton()
	{
		searchSubmitButton.click();
	}
	
	public void clickSearchResettbutton()
	{
		resetButton.click();
	}
	
	public void clickDeleteButton()
	{
		deleteButton.click();
	}
	
	
	public ManageDeliveryBoyElement(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
