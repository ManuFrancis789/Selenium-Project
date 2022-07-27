package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class DataproviderSample1 
{
	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass();
	By usernameXpath = By.xpath("//input[@name =\"txtUsername\"]");
	By passwordXpath = By.xpath("//input[@name =\"txtPassword\"]");
	By loginXpath = By.xpath("//input[@value =\"LOGIN\"]");
	
  @Test(dataProvider = "login")
  public void test1(String username, String password)
  
  {
	utilobj.sendkeysMethodUtility(usernameXpath, username);  
	utilobj.sendkeysMethodUtility(passwordXpath, password);
	utilobj.clearMethodUtility(usernameXpath);
	utilobj.clearMethodUtility(passwordXpath);
  }

  
  
  
  @DataProvider(name ="login")
  public Object[][] dp() 
  {
    return new Object[][] 
    		{
      new Object[] { "manu", "admin123" },
      new Object[] { "siddarth", "yyyyy" },
      new Object[] { "sneha", "admin123" },
    };
  }
  @BeforeTest
  public void beforeTest() 
  {
	driver = utilobj.browserLaunch(url,"chrome");  
  }

  @AfterTest
  public void afterTest() {
  }

}
