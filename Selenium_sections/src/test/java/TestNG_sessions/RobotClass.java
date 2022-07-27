package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class RobotClass 
{
	WebDriver driver;
	String url = "https://www.grammarly.com/plagiarism-checker";
	String browser="chrome";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass();
	By uploadFileXpath = By.xpath("//div[text()='Upload a file']");
  @Test
  public void robotMethod() throws Exception 
  {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,200)");
	  
	  utilobj.clickMethodUtility(uploadFileXpath);
	 
	  StringSelection s = new StringSelection("C:\\Users\\91859\\Downloads\\sampleFile.jpeg"); /// for copy to clipboard
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);  //// for copy clipboard
	  //utilobj.clickMethodUtility(chooseFileXpath);
	  
	  Robot robj = new Robot();
	  robj.keyPress(KeyEvent.VK_CONTROL);  //for pasting
	  robj.keyPress(KeyEvent.VK_V);        //for pasting
	  
	  robj.keyRelease(KeyEvent.VK_CONTROL);
	  robj.keyRelease(KeyEvent.VK_V);
	  
	  robj.keyPress(KeyEvent.VK_ENTER);
	  robj.keyRelease(KeyEvent.VK_ENTER);
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  driver = utilobj.browserLaunch(url, browser);
  }

  @AfterTest
  public void afterTest() {
  }

}
