package Assignments;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class AlertAssignments
{
	WebDriver driver;
	
	String url = "http://demo.guru99.com/test/delete_customer.php ";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass ();
	By customeridXpath = By.xpath("//input[@name=\"cusid\"]");
	By submitXpath = By.xpath("//input[@name=\"submit\"]");
  @Test
  public void alertMethod() 
  {
	  WebElement customeridElement = driver.findElement(customeridXpath);
	  WebElement submitElement = driver.findElement(submitXpath);
	  customeridElement.sendKeys("Manu");
	  submitElement.click();
	  utilobj.alertAccept();
	  utilobj.alertAccept();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  driver = utilobj.browserLaunch(url, "chrome");
  }

  @AfterTest
  public void afterTest()
  {
  }

}
