import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionclassKeyboardHandling  
{
	  WebDriver driver;
	  String url="https://www.google.com/";
	  UtilityRepositoryClass utilobj = new UtilityRepositoryClass ();
	  By searchxpath = By.xpath("//input[@title=\"Search\"]");
  @Test
  public void keyBoardHandlingMethod() 
  {
	WebElement searchoption = driver.findElement(searchxpath);
	Actions actionobj = new Actions(driver);
	actionobj.keyDown(searchoption, Keys.SHIFT).sendKeys(searchoption, "manu").keyUp(searchoption, Keys.SHIFT).build().perform();
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
