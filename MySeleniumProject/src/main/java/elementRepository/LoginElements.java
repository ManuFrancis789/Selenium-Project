package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityRepository.GeneralUtilities;

public class LoginElements 
{
WebDriver driver;
GeneralUtilities utilobj = new GeneralUtilities();
@FindBy(xpath="//input[@name='username']")
WebElement userName;

@FindBy(xpath="//input[@name='password']")
WebElement password;

@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
WebElement signinBtn;

@FindBy(xpath="alert alert-danger alert-dismissible")
WebElement alertMessage;

@FindBy(xpath ="//button[@data-dismiss='alert']")
WebElement dismissBtn;

@FindBy(xpath ="//input[@id='remember']")
WebElement rememberMeChkBox;

@FindBy(xpath ="//label[@for='remember']")
WebElement rememberMe;


public void typeUserName(String user)
{
	userName.sendKeys(user);
}

public void typePassword(String pass)
{
	password.sendKeys(pass);
}

public void clickMethod()
{
	signinBtn.click();
}

public String alertMessageText()
{
	return(alertMessage.getText());
}

public String getTextDismissbtn()
{
	return(dismissBtn.getText());
}
public void clickDismissBtn()
{
	dismissBtn.click();	
}

public boolean isRememberMeSelected()
{
	return(rememberMeChkBox.isSelected());
}

public void rememberMeClick()
{
	rememberMe.click();
}
public void loginMethod(String user,String pass)
{
	userName.sendKeys(user);
	password.sendKeys(pass);
	signinBtn.click();
}

public LoginElements(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);

}

}
