package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class ScreenShotSample 
{
	WebDriver driver;
	String url ="https://www.techlistic.com/p/demo-selenium-practice.html";
  @Test
  public void test1() 
  {
	  String expectedTitle = "Techlisti";
	  WebElement xpathTechlistic = driver.findElement(By.xpath("//div[text()='Techlistic ']"));
	  String actualTitle=xpathTechlistic.getText();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  @Test
  public void test2()
  {
	  System.out.println("Test");
  }
  @AfterMethod
  public void afterMethod(ITestResult result) throws Exception 
  {
	  
	 
	  if(ITestResult.FAILURE==result.getStatus())
	  {
	  
		  Date d = new Date();
		  String date = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File source=ts.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(source, new File("./Screenshots/"+result.getName()+date));
		  System.out.println("Screenshot taken");
		  
			 
	  }
	  
	  
	  
  }

  
  @BeforeTest
  public void beforeTest()
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
