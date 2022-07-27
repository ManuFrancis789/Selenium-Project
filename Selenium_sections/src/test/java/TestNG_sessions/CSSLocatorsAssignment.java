package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class CSSLocatorsAssignment 
{
	WebDriver driver;
  @Test
  public void find() 
  {
	 driver.get("http://www.opesmount.in/grocerystore1/");
	 
	  //WebElement partialOpesmount = driver.findElement(By.partialLinkText("Privacy"));
	  //partialOpesmount.click();
	  
	WebElement cssbyClassOpesmount = driver.findElement(By.cssSelector("input.form-control"));
	 cssbyClassOpesmount.click();
	 
	 //WebElement cssbyClassShop = driver.findElement(By.cssSelector(""));
	 //cssbyClassShop.click();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() 
  {
  }

}
