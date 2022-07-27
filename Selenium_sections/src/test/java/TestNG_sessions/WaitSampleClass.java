package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class WaitSampleClass 
{
	WebDriver driver;
	String url = "http://demo.guru99.com/test/guru99home/";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass ();
	
  @Test
  public void waitMethod() 
  {
	//WebElement agileElement =   driver.findElement(By.xpath("//a[text()=\"Agile Project\"]"));
	/*WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
	explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()=\"Agile Project\"]"))).click();
	*/
	 Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
			 .withTimeout(Duration.ofSeconds(10))
			 .pollingEvery(Duration.ofSeconds(1))
			 .ignoring(Exception.class);
	 fluentwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Agile Project']"))).click();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  driver = utilobj.browserLaunch(url, "chrome");
  }

  @AfterTest
  public void afterTest() {
  }

}
