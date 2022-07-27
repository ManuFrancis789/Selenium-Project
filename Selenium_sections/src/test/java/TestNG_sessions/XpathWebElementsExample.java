package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class XpathWebElementsExample 

{
	WebDriver driver;
	String url="https://www.python.org/";
  @Test(enabled = true,description = "web elements")
  public void test1() 
  {
	  WebElement t1 = driver.findElement(By.xpath("//input[@id=\"id-search-field\"]"));
	  t1.sendKeys("mmmmmmmm");
	  
	  
	  WebElement t2 = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	  t2.submit();
	  //driver.navigate().back();
	   
	  //WebElement t3 = driver.findElement(By.xpath("//input[@id=\"id-search-field\"]"));
	  //t3.clear();
	  WebElement t4 = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	  boolean x = t4.isDisplayed();
	  System.out.println(x);
	  WebElement t5 = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	  boolean y = t5.isEnabled();
	  System.out.println(y);
	  WebElement t6 = driver.findElement(By.xpath("//input[@id=\"id-search-field\"]"));
	 System.out.println( t6.getSize());
	 System.out.println(t6.getLocation());
	 System.out.println(t6.getTagName());
	 System.out.println(t4.getText());
	 System.out.println(t4.getAttribute("type"));
	 System.out.println(t4.getCssValue("color"));
	 System.out.println(t4.getCssValue("font"));
	 System.out.println(t4.getCssValue("outline"));
	 
	
	 
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
