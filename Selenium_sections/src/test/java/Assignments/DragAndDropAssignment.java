package Assignments;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragAndDropAssignment 
{
	WebDriver driver;
	String url = "http://jqueryui.com/droppable/";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass ();
	By dragablexpath = By.xpath("//div[@id=\"draggable\"]");
	By droppablexpath = By.xpath("//div[@id=\"droppable\"]");
	By iframexpath = By.xpath("//iframe[@class=\"demo-frame\"]");
	By mousehoverxpath = By.xpath("//a[text()='Support']");
	By learningcentrexpath = By.xpath("//a[text()='Learning Center']");
	
  @Test
  public void dragAndDropMethod() 
  {
	  WebElement mouseHover = driver.findElement(mousehoverxpath);
	 WebElement learningCentre = driver.findElement(learningcentrexpath);
	 
	
	  Actions actionobj = new Actions(driver);
	  
	  actionobj.moveToElement(mouseHover).click(learningCentre).build().perform();
	  
	  driver.navigate().back();
	  driver.navigate().refresh();
	  
	  WebElement iframe = driver.findElement(iframexpath);
	  driver.switchTo().frame(iframe);
	
	  
	  WebElement drag = driver.findElement(dragablexpath);
	  WebElement drop = driver.findElement(droppablexpath);
	  
	  actionobj.dragAndDrop(drag, drop).build().perform();
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
