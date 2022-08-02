package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilityRepository.GeneralUtilities;

public class ManageLocationsElements 
{
	WebDriver driver;
	GeneralUtilities utilobj = new GeneralUtilities();
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[11]")
	WebElement manageLocation ;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newBtn ;
	
	@FindBy(xpath="(//select[@class='form-control selectpicker'])[1]")
	WebElement countryDropDown  ;
	
	@FindBy(xpath="(//select[@class='form-control selectpicker'])[2]")
	WebElement stateDropDown  ;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement locationTextBox  ;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement deliveryChargeTextbox  ;
	
	@FindBy(xpath="//button[@name='create']")
	WebElement saveBtn  ;
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-map-marker']")
	WebElement manageLocationsTab ;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td")
	WebElement getLocationName  ;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(xpath="//input[@class='form-control']")
	WebElement locationSearchTextbox  ;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[2]")
	WebElement getCountryName;
		
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix align-center']")
	WebElement searchButton;
	
	@FindBy(xpath="//button[@class='close']")
	WebElement alert;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']/h5")
	WebElement alertText;
	
	@FindBy(xpath="(//a[@class='btn btn-sm btn btn-danger btncss'])[1]")
	WebElement delete ;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[5]/a/span")
	WebElement activeBtn ;
	
	
	public void clickManageLocation()
	{
		manageLocation.click();
	}
	
	public void clicknewBtn()
	{
		newBtn.click();
	}
	
	public void selectCountry(String country)
	{
		Select selectobj3 = new Select(countryDropDown);
		selectobj3.selectByVisibleText(country);
	}
	
	public void selectState(String state)
	{
		Select selectobj3 = new Select(stateDropDown);
		selectobj3.selectByVisibleText(state);
	}
	
	public void typedeliveryLocation(String text)
	{
		locationTextBox.sendKeys(text);
	}
	
	public void typedeliveryCharge(String text)
	{
		deliveryChargeTextbox .sendKeys(text);
	}
	
	public void clickSaveBtn()
	{
		saveBtn.click();
	}
	
	public void clickManageLocationTab()
	{
		manageLocationsTab.click();
	}
	
	public String getLocationName()
	{
		return(getLocationName.getText());
	}
	
	public void clickSearch()
	{
		search.click();
	}
	
	public void typedeliveryLocationSearch(String text)
	{
		locationSearchTextbox.sendKeys(text);
	}
	
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	public void clickAlert()
	{
		alert.click();
	}
	
	public String getCountryName()
	{
		return(getCountryName.getText());
	}
	
	public String getAlertText()
	{
		return(alertText.getText());
	}
	
	public void clickdelete()
	{
		delete.click();
	}
	
	public String getActiveBtnStatus()
	{
		return(activeBtn.getText());
	}
	
	public void clickActiveBtn()
	{
		activeBtn.click();
	}
	
	
	public ManageLocationsElements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
