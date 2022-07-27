package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class UploadAndDownloadClass 
{
	WebDriver driver;
	String url = "https://demoqa.com/upload-download";
	String browser="chrome";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass();
	By downloadXpath = By.xpath("//a[@id='downloadButton']");
	By chooseFileXpath = By.xpath("//input[@id='uploadFile']");
  @Test
  public void f() 
  {
	  //"C:\Users\91859\Downloads\sampleFile.jpeg"
	  // utilobj.clickMethodUtility(downloadXpath);
	   WebElement upload = driver.findElement(chooseFileXpath);
	   upload.sendKeys("C:\\Users\\91859\\Downloads\\sampleFile.jpeg");
	
	   
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
