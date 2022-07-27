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

public class RadioButtonAssignment 
{
	WebDriver driver;
	String url = "https://demo.guru99.com/test/ajax.html";
	
  @Test(enabled = false)
  public void radioButtonMethod() 
  {
	  WebElement yesRadioButton = driver.findElement(By.xpath("//input[@name=\"name\"]"));
	  WebElement noRadioButton = driver.findElement(By.xpath("(//input[@name=\"name\"])[2]"));
	
	  Assert.assertFalse(yesRadioButton.isSelected());
	  Assert.assertFalse(noRadioButton.isSelected());
	  
	  
  }
  @Test
  public void radioButtonMethodClick() 
  {
	  
	  WebElement noRadioButton = driver.findElement(By.xpath("(//input[@name=\"name\"])[2]"));
	  noRadioButton.click();
	  Assert.assertTrue(noRadioButton.isSelected());
	  
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
