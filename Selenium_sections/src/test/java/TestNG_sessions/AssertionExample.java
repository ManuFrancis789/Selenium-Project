package TestNG_sessions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertionExample 
{  

	SoftAssert softassert = new SoftAssert();
	
	
	String url ="https://www.techlistic.com/p/demo-selenium-practice.html";
	WebDriver driver;
  @Test(enabled = false)
  public void assertExample() 
  {
	  String expectedTitle = "Techlisti";
	  WebElement xpathTechlistic = driver.findElement(By.xpath("//div[text()='Techlistic ']"));
	  String actualTitle=xpathTechlistic.getText();
	  try 
	  {
	    	  Assert.assertEquals(actualTitle, expectedTitle);
	    	  
	  }
	  
	  catch(AssertionError ae)
	  {
		  ae.printStackTrace();
		  
	  }
	  boolean value = xpathTechlistic.isDisplayed();
	  Assert.assertTrue(value);
	  System.out.println("Test");
  }
  @Test
  public void test2() 
  {
	
	  System.out.println("Test");
  }
  @Test(description ="soft assert example")
  public void test3() 
  {
	  String expectedTitle = "Techlisti";
	  WebElement xpathTechlistic = driver.findElement(By.xpath("//div[text()='Techlistic ']"));
	  String actualTitle=xpathTechlistic.getText();
	  boolean x = xpathTechlistic.isDisplayed();
	  
	  softassert.assertEquals(actualTitle, expectedTitle);
	  //softassert.assertFalse(x, "failed");
	  softassert.assertTrue(x, "pass");
	  System.out.println("PASS");
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
  public void afterTest() {
  }

}
