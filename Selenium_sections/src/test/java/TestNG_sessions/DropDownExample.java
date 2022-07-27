package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropDownExample
{
	//String url = "https://demo.guru99.com/test/newtours/register.php";  /// for Single drop down
	String url="http://jsbin.com/osebed/2";  /// for multiple drop down
	  WebDriver driver;
  @Test(enabled = false)
  public void dropDown() 
  {
	  WebElement xpathdropdown = driver.findElement(By.xpath("//select[@name=\"country\"]"));
	  Select selectobj = new Select(xpathdropdown);
	  selectobj.selectByIndex(1);
	  selectobj.selectByVisibleText("ANDORRA");
	 selectobj.selectByValue("BAHRAIN");
	  
  }
  @Test(description ="multiple dropdown")
  public void multipleDropdown()
  {
	  WebElement xpathmultipleDropdown = driver.findElement(By.xpath("//select[@id='fruits']"));
	  Select selectobj = new Select(xpathmultipleDropdown);
	  selectobj.selectByIndex(0);
	  selectobj.selectByVisibleText("Apple");
	  selectobj.selectByValue("grape");
	  selectobj.deselectByIndex(0);
	  selectobj.deselectByValue("grape");
	  selectobj.deselectByVisibleText("Apple");
	  
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
