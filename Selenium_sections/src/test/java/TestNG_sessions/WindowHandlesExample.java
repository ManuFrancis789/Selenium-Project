package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class WindowHandlesExample 
{
	WebDriver driver;
	String url = "https://demoqa.com/browser-windows";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass ();
  @Test
  public void WindowHandleMethod() 
  {
	  String parentHandle = driver.getWindowHandle();
	  System.out.println("Parent Handle = "+parentHandle);
	  WebElement newtab = driver.findElement(By.xpath("//button[@id=\"tabButton\"]"));
	  newtab.click();
	  Set <String> allWindows = driver.getWindowHandles();
	  System.out.println(allWindows);
	  
	  Iterator <String> iterator = allWindows.iterator();
	  
	  while(iterator.hasNext())
	  {
		  String childHandle = iterator.next();
		  if(!parentHandle.equalsIgnoreCase(childHandle))
		  {
			  driver.switchTo().window(childHandle);
			  System.out.println("child handle = " +childHandle);
			  WebElement text = driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
			  System.out.println(text.getText());
			  
		  }
	  }
	driver.switchTo().window(parentHandle);
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
