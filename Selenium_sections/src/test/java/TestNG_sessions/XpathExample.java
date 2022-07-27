package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class XpathExample
{
	WebDriver driver;
  @Test(enabled = false,description = "normal xpath")
  public void ipFind() 
  
  {
	  driver.get("http://www.opesmount.in/grocerystore1/");
	  //syntax for normal
	  
	  //WebElement xpathSearch = driver.findElement(By.xpath("//input[@type = 'text']"));
	  //xpathSearch.sendKeys("Text");
	  //System.out.println(xpathSearch);
  
	  //syntax with contains
	  
	  //WebElement xpathwithContainsSearch = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
	  //xpathwithContainsSearch.click();
	  
	  WebElement xpathContainsRegister = driver.findElement(By.xpath("//a[contains(@href,'register')]"));
	  xpathContainsRegister.click();
	  
	  ///   //a[text()='Home']  with text
	  
	  ///   //a[starts-with(text(),'Home')]     inner text with Start with 
  }
  @Test(enabled = false,description = "And,OR")
  public void xpathAndOr()
  {
	 driver.get("http://www.opesmount.in/grocerystore1/"); 
	 ////input[@type = 'text' or @name = 'search']
	 //WebElement xpathAndOrSearch = driver.findElement(By.xpath("//input[@type = 'text' or @name = 'search']"));
	// xpathAndOrSearch.sendKeys("mmmm");
	 WebElement xpathAndSearch = driver.findElement(By.xpath("//input[@type = 'text' and @name = 'search']"));
	 xpathAndSearch.sendKeys("MANU");
  }
  
  @Test(enabled = false,description = "text")
  public void xpathText()
  {
	  driver.get("http://www.opesmount.in/grocerystore1/");
	  WebElement xpathTextSearch = driver.findElement(By.xpath("//a[text()='Login']"));
	  xpathTextSearch.click();
	  driver.navigate().back();
  }
  
  @Test(enabled =false,description = "contains")
  
public void xpathContains()
{
	  driver.get("http://www.opesmount.in/grocerystore1/");
	  WebElement xpathContainsHome = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
	  xpathContainsHome.click();
}
  
  @Test(enabled = true,description = "Start with")
  public void xpathStartwith()
  {
	  driver.get("http://www.opesmount.in/grocerystore1/");
	  WebElement xpathStartwithHome = driver.findElement(By.xpath("//a[starts-with(text(),'Ho')]"));
	  xpathStartwithHome.click();
	  
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
