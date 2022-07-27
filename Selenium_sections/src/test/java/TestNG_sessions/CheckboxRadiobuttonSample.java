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

public class CheckboxRadiobuttonSample 
{
	WebDriver driver;
	String url="https://demo.guru99.com/test/radio.html";
  @Test
  public void radioButtonMethod() 
  {
	  WebElement option1 = driver.findElement(By.xpath("//input[@id=\"vfb-7-1\"]"));
	  WebElement option2 = driver.findElement(By.xpath("//input[@id=\"vfb-7-2\"]"));
	  WebElement option3 = driver.findElement(By.xpath("//input[@id=\"vfb-7-3\"]"));
	  
	  option1.click();
	  option2.click();
	  option3.click();
	  
	  Assert.assertFalse(option1.isSelected());
	  Assert.assertFalse(option2.isSelected());
	  Assert.assertTrue(option3.isSelected());
  }
  
  @Test
  public void checkboxMethod()
  {
	  WebElement checkbox1 = driver.findElement(By.xpath("//input[@id=\"vfb-6-0\"]"));
	  WebElement checkbox2 = driver.findElement(By.xpath("//input[@id=\"vfb-6-1\"]"));
	  WebElement checkbox3 = driver.findElement(By.xpath("//input[@id=\"vfb-6-2\"]"));
	  for(int i=0;i<2;i++)     //for loop for clicking 2 times  (for selecting and deselecting)
	  {
	  checkbox1.click();
	  checkbox2.click();
	  checkbox3.click();
	  }
	  Assert.assertFalse(checkbox1.isSelected());
	  Assert.assertFalse(checkbox2.isSelected());
	  Assert.assertFalse(checkbox3.isSelected());
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
	  
  }

}
