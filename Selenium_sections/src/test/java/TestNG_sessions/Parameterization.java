package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Parameterization
{
	WebDriver driver;
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass();
	By username = By.xpath("//input[@name =\"txtUsername\"]");
	By password = By.xpath("//input[@name =\"txtPassword\"]");
	By login = By.xpath("//input[@value =\"LOGIN\"]");
  @Test
  public void test() 
  {
	 utilobj.sendkeysMethodUtility(username,"Admin");
	 utilobj.sendkeysMethodUtility(password, "admin123");
	 utilobj.clickMethodUtility(login);
  }
  @Parameters({"url","browser"})
  @BeforeTest
  public void beforeTest(String url,String browser) 
  {
	driver =  utilobj.browserLaunch(url,browser); 
  }

  @AfterTest
  public void afterTest() {
  }

}
