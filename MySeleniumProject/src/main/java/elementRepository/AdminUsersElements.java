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
	
	@FindBy(xpath = "(//a[@class='btn btn-sm btn-danger btn-rounded'][1])")
	WebElement lockButton;
	
	@FindBy(xpath = "(//a[@class='btn btn-sm btn btn-success btncss'])[1]")
	WebElement unLockButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']/h5")
	WebElement alertText;
	
	@FindBy(xpath="(//span[@class='badge bg-success'])[1]")
	WebElement active;
	
	@FindBy(xpath="(//span[@class='badge bg-warning'])[1]")
	WebElement inactive;
	
	@FindBy(xpath="(//a[@class='btn btn-sm btn btn-primary btncss'])[1]")
	WebElement update;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement updateUsername;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	WebElement updatePassword ;
	
	@FindBy(xpath="(//select[@class='form-control'])[2]")
	WebElement updateDropdown ;
	
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
	
	public void clickAlert()
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
	
	public void clickLockButton()
	{
		lockButton.click();
	}
	
	public void clickUnLockButton()
	{
		
		unLockButton.click();
	}
	
	public String getAlertText()
	{
		return(alertText.getText());
	}
	
	public void clickActiveButton()
	{
		active.click();
	}
	public void clickInactiveButton()
	{
		inactive.click();
	}
	
	public String getActiveButtonStatus()
	{
		return(active.getText());
	}
	
	public void clickUpdateBtn()
	{
		update.click();
	}
	
	public void typeUpdateUsername(String uName)
	{
	updateUsername.clear();
	updateUsername.sendKeys(uName);
	}
	
	public void typeUpdatePassword(String password)
	{
		updatePassword.clear();
		updatePassword.sendKeys(password);
	}
	
	public void selectUpdateUserType(String text)
	{
		 Select selectobj = new Select(updateDropdown);
		 
		  selectobj.selectByVisibleText(text);
	}
	public AdminUsersElements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
