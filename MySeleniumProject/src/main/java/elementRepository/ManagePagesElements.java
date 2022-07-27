package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityRepository.GeneralUtilities;
import utilityRepository.UploadUtility;

public class ManagePagesElements 
{
	WebDriver driver;
	GeneralUtilities utilobj = new GeneralUtilities();
	UploadUtility uploadObj = new UploadUtility();
	
	@FindBy(xpath="(//a[@class='small-box-footer'] )[1]")
	WebElement managePages;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchBtn;
	
	@FindBy(xpath = "//input[@placeholder='Title']")
	WebElement searchTextBox;
	
	@FindBy(xpath="//button[@name='Search']")
	WebElement submitSearch;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td")
	WebElement actualSearchFlowers;
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement newButton;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement pageTitle;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement pageName;
	
	@FindBy(xpath="//div[@class='note-editable card-block']")
	WebElement pageDescription;
	
	@FindBy(xpath="//input[@name='main_img']")
	WebElement chooseFile;
	
	@FindBy(xpath="(//a[@class='btn btn-sm btn btn-danger btncss'])[1]")
	WebElement delete;
	
	@FindBy(xpath="//button[@class='close']")
	WebElement deleteAlert;
	
	public void managePagesClickMethod()
	{
		managePages.click();
	}
	
	public void clickSearchbtn()
	{
		searchBtn.click();
	}
	
	public void searchTextBoxEnterdata(String text)
	{
		searchTextBox.click();
		searchTextBox.sendKeys(text);
	}
	
	public void clickSubmitSearch()
	{
		
		submitSearch.click();
	}
	
	public String actualTextFlowerSearch()
	{
		String a = actualSearchFlowers.getText();
		return(a);
	}
	
	public boolean isDisplayedFlowers()
	{
		boolean a = actualSearchFlowers.isDisplayed();
		return(a);
	}
	public void newBtnClick()
	{
		newButton.click();
	}
	
	public void pageTitleSendKeys(String title)
	{
		pageTitle.sendKeys(title);
	}
	
	public void pageNameSendKeys(String name)
	{
		pageName.sendKeys(name);
	}
	
	public void pageDescriptionSendKeys(String description)
	{
		pageDescription.sendKeys(description);
	}
	
	public void pageTitleClear()
	{
		pageTitle.clear();
	}
	
	public void pageNameClear()
	{
		pageName.clear();
	}
	
	public void pageDescriptionClear()
	{
		pageDescription.clear();
	}
	
	public String getSearchAttributeValue()
	{
		return(searchTextBox.getAttribute("value"));
	}
	public void uploadImage(String text)
	{
		chooseFile.sendKeys(text);
	}
	
	public String getAddnewPageTitleAttributeValue()
	{
		return(pageTitle.getAttribute("value"));
	}
	
	public String getAddnewPageNameAttributeValue()
	{
		return(pageName.getAttribute("value"));
	}
	
	public String getAddnewPagedescriptionAttributeValue()
	{
		return(pageDescription.getAttribute("value"));
	}
	// System.out.println(e.getAttribute("value").isEmpty());
	public boolean isUploadImageValueAttributeEmpty()
	{
		
		return(chooseFile.getAttribute("value").isEmpty());
	}
	
	public void clickDelete()
	{
		delete.click();
	}
	
	public String getDeleteAlerttext()
	{
		return(deleteAlert.getText());
	}
	
	public void clickDeleteAlert()
	{
		deleteAlert.click();
	}
	
	public ManagePagesElements (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
