package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityRepository.GeneralUtilities;

public class DashBoardElements 
{
	WebDriver driver;
	GeneralUtilities utilobj = new GeneralUtilities();
	
	@FindBy(xpath="(//a[@class='nav-link'])[3]")
	WebElement manageExpense ;
	
	@FindBy(xpath="//p[text()='Expense Category']")
	WebElement expenseCategory ;
	
	@FindBy(xpath="(//a[@class='btn btn-sm btn btn-primary btncss'])[1]")
	WebElement updateButton;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement updateTextbox;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement updateSave;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td")
	WebElement getTitle;
	
	@FindBy(xpath="//button[@class='close']")
	WebElement alert;
	
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-danger btncss'][1]")
	WebElement delete;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newBtn ;
	
	@FindBy(xpath="//button[@name='Create']")
	WebElement save ;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td")
	WebElement expectedNew;
	
	
	public void clickUpdate()
	{
		updateButton.click();
	}
	
	public void clickManageExpenseTab()
	{
		manageExpense.click();
	}
	
	public void clickexpenseCategoryTab()
	{
		expenseCategory.click();
	}
	
	public void clearTextBox()
	{
		updateTextbox.clear();
	}
	
	public void enterDataInUpdateTextBox(String text)
	{
		updateTextbox.sendKeys(text);
	}
	
	public void clickSave()
	{
		updateSave.click();
	}
	 
	public String getTitleString()
	{
		return(getTitle.getText());
	}
	
	public void clickAlert()
	{
		alert.click();
	}
	
	public void clickDelete()
	{
		delete.click();
	}
	
	public void clickNewBtn()
	{
		newBtn.click();
	}
	
	public void clickSaveNew()
	{
		save.click();
	}
	
	public String getNewExpenseCategory()
	{
		return(expectedNew.getText());
	}
	
	public DashBoardElements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
}
