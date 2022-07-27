package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionclassRightandDoubleClick 
{
	WebDriver driver;
	String url ="https://demo.guru99.com/test/simple_context_menu.html";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass ();
	By xpathRightClick = By.xpath("//span[contains(text(),'right')]");
  @Test
  public void rightClick() 
  {
	  Actions actionobj = new Actions(driver);
	  WebElement doubleClickElement = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
	  actionobj.doubleClick(doubleClickElement).build().perform();
	  //WebElement rightClickelement = driver.findElement(xpathRightClick);
	  //actionobj.contextClick(rightClickelement).build().perform();
	  //driver.navigate().refresh();
	 
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
