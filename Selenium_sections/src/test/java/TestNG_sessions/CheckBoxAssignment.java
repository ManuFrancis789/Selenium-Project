package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CheckBoxAssignment 
{
	WebDriver driver;
	String url = "https://demoqa.com/checkbox";
	
  @Test(enabled = false)
  public void checkBoxMethod() 
  {
	 WebElement homeCheckBox = driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"]"));
	 //System.out.println(homeCheckBox.isSelected()); 
	 Assert.assertFalse(homeCheckBox.isSelected());
	  
  }
  
  @Test(enabled = true)
  public void checkBoxClick() 
  {
	  WebElement homeCheckBoxclick = driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"]"));
	  homeCheckBoxclick.click();
	  System.out.println(homeCheckBoxclick.isSelected());
	  Assert.assertTrue(homeCheckBoxclick.isSelected());
	  
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
	  //driver.close();
  }

}
