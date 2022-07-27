package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilityRepository.GeneralUtilities;

public class AdminUsersElements 
{
	WebDriver driver;
	GeneralUtilities utilobj = new GeneralUtilities();
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[2] ")
	WebElement adminUsers;
	
	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger'] ")
	WebElement newBtn;
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement newAdminUserName;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement newAdminPassword;
	
	@FindBy(xpath = "(//select[@class='form-control'])[2]")
	WebElement userTypeDropDown;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement save;
	
	@FindBy(xpath = "//button[@class='close']")
	WebElement addAlert;
	
	@FindBy(xpath = "(//a[@class='btn btn-sm btn btn-danger btncss'])[1]")
	WebElement delete;
	
	@FindBy(xpath = "//button[@class='close']")
	WebElement deleteAlert;
	
	public void clickAdminUser()
	{
		adminUsers.click();
	}
	
	public void clicknewButton()
	{
		newBtn.click();
	}
	public void typeNewAdminUserName(String text)
	{
		newAdminUserName.sendKeys(text);
	}
	
	public void typeNewAdminPassword(String text)
	{
		newAdminPassword.sendKeys(text);
	}
	
	public void selectUserType(String text)
	{
		Select selectobj = new Select(userTypeDropDown);
		selectobj.selectByVisibleText(text);
	}
	
	public void clickSaveButton()
	{
		save.click();
	}
	
	public void clickAddAlert()
	{
		addAlert.click();
	}
	
	public void clickDelete()
	{
		delete.click();
	}
	
	public void clickDeleteAlert()
	{
		deleteAlert.click();
	}
	
	public AdminUsersElements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
