package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityRepository.GeneralUtilities;

public class AdminUsersElements 
{
	WebDriver driver;
	GeneralUtilities utilobj = new GeneralUtilities();
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[2] ")
	WebElement adminUsers;
	
	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger'] ")
	WebElement newBtn;
	
	public void clickAdminUser()
	{
		adminUsers.click();
	}
	public AdminUsersElements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
