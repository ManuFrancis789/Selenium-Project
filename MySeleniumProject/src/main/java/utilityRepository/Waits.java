package utilityRepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Waits 
{
	WebDriver driver;
	
	
 
  public void explicitWaitMethod(By properties) 
  {
	
	WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
	explicitWait.until(ExpectedConditions.presenceOfElementLocated(properties)).click();
		
  }
  
  public void fluentWaitMethod(By properties) 
  {
	
	 Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
			 .withTimeout(Duration.ofSeconds(10))
			 .pollingEvery(Duration.ofSeconds(1))
			 .ignoring(Exception.class);
	 fluentwait.until(ExpectedConditions.presenceOfElementLocated(properties)).click();
  }

}
