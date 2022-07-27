package TestNG_sessions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SampleAssertion 
{
	SoftAssert softassert = new SoftAssert();
	WebDriver driver;
	String url = "http://www.opesmount.in/grocerystore1/";
	
  @Test(enabled = false,description = "Hard assert")
  public void test1() 
  {
	  WebElement xpathTitle = driver.findElement(By.xpath("//img[@title=\"Grocerystore\"]"));
	 
	  Assert.assertNull(xpathTitle);
	  
	  System.out.println("Test1");
		 		  
  }
  
  @Test
  public void test2()
  {
	  System.out.println("Test2");
  }
  
  @Test(enabled = true,description ="Soft Assert")
  public void test3()
  {
	  
	  WebElement xpathTitle = driver.findElement(By.xpath("//img[@title=\"Grocerystore\"]"));
	  softassert.assertNull(xpathTitle, "SOFT ASSERT EXAMPLE");
	  System.out.println("Test3");
	  softassert.assertAll();
	  
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
  public void afterTest() 
  {
	  driver.close();
  }

}
