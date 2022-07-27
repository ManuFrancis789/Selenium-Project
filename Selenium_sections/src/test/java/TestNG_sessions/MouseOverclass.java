package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseOverclass 
{
	
	WebDriver driver;
	String url="http://mrbool.com/";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass ();
  @Test
  public void mouseHoverMethod() 
  {
	  Actions actionobj = new Actions(driver);
	  WebElement mouseHover = driver.findElement(By.xpath("//a[@class=\"menulink\"]"));
	  WebElement articles = driver.findElement(By.xpath("//a[contains(text(),'Articles')]"));
	  actionobj.moveToElement(mouseHover).build().perform();
	 // actionobj.click(articles).build().perform();
	  //or
	  actionobj.sendKeys(articles, Keys.DOWN).build().perform();
	
  }
  @BeforeTest
  public void beforeTest() 
  {
	  driver =  utilobj.browserLaunch(url, "chrome");
  }

  @AfterTest
  public void afterTest() {
  }

}
