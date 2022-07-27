package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class IframeClass 
{
	WebDriver driver;
	//String url = "https://www.w3schools.com/html/html_iframe.asp";
	String url ="https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass ();
  @Test
  public void iframeMethod() 
  {
		List <WebElement> iframecount = driver.findElements(By.tagName("iframe"));
		int count = iframecount.size();
		System.out.println(count);
	WebElement iframe = driver.findElement(By.xpath("//iframe[@name=\"globalSqa\"]"));
	
	// driver.switchTo().frame(iframe);
	//or
	//driver.switchTo().frame("globalSqa");
	//or
	driver.switchTo().frame(2);
	 WebElement searchFrame = driver.findElement(By.xpath("//input[@name=\"s\"]"));
	searchFrame.sendKeys("java");
		 
	driver.switchTo().defaultContent();
	             //or
	//driver.switchTo().parentFrame();
	
	 WebElement searchParent = driver.findElement(By.xpath("//input[@name=\"s\"]"));
	 searchParent.sendKeys("manu");
//	search.sendKeys("manu");
	
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
