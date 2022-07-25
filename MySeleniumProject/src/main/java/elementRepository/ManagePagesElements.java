package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityRepository.GeneralUtilities;

public class ManagePagesElements 
{
	WebDriver driver;
	GeneralUtilities utilobj = new GeneralUtilities();
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
	public ManagePagesElements (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
