package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragandDropClass 
{
	  WebDriver driver;
	  String url="https://demoqa.com/droppable/";
	  UtilityRepositoryClass utilobj = new UtilityRepositoryClass ();
	  By dragElement = By.xpath("//div[@id=\"draggable\"]");
	  By dropElement = By.xpath("//div[@id=\"droppable\"]");
  @Test
  public void dragAndDropMethod() 
  {
	 WebElement drag = driver.findElement(dragElement);
	 WebElement drop = driver.findElement(dropElement);
	
	 Actions actionobj = new Actions(driver);
	// actionobj.dragAndDrop(drag, drop).build().perform();
	 
	 				//or
	
	 actionobj.clickAndHold(drag).moveToElement(drop).release().build().perform();
	 
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
