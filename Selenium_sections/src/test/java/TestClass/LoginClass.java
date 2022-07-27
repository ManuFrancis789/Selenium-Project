package TestClass;

import org.testng.annotations.Test;

import Pages.Login;
import UtilityRepository.ExcelRead;
import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginClass 
{
	WebDriver driver;
	UtilityRepositoryClass obj = new UtilityRepositoryClass();
	Login loginobj;
	ExcelRead excelobj;
  @Test(description="To validate login page")
  public void validateLogin() throws Exception 
  {
	  
	  loginobj = new Login(driver);
	  excelobj =  new ExcelRead();
	  loginobj.typeEmailId(excelobj.readingStringData(1, 0));
	  loginobj.typePassword(excelobj.readingStringData(1, 1));
	  
	 // loginobj.typeEmailId("xxxx");
	 // loginobj.typePassword("mmmmm");
	  loginobj.loginClick();
	  WebElement xpathLoginerrorMsg = driver.findElement(By.xpath("//div [contains(text(),\"Facebook is\")]"));
	  String actual = xpathLoginerrorMsg.getText();
	  Assert.assertEquals(actual, "Facebook is down for required maintenance right now, but you should be able to get back on within a few minutes. In the meantime,  ");
  }
  @BeforeTest
  public void beforeTest() 
  {
	 driver = obj.browserLaunch("https://www.facebook.com/", "chrome");            ///driver control to before test
  }

  @AfterTest
  public void afterTest() {
  }

}
