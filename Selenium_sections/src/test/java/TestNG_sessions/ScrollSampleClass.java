package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class ScrollSampleClass 
{
	WebDriver driver;
	String url = "http://demo.guru99.com/test/guru99home/";   ///for vertical
	//String url = "http://demo.guru99.com/test/guru99home/scrolling.html";   //for horizontal
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass ();
	
  @Test(enabled = true)
  public void scrollMethod() 
  {
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 // js.executeScript("window.scrollBy(0,500)");
	  WebElement linuxXpath = driver.findElement(By.xpath("(//div[@class=\"canvas-middle\"])[11]"));
	 // Point obj = linuxXpath.getLocation();
	  //int x = obj.getX();
	//  int y = obj.getY();
	 // System.out.println("X = " +x);
	  //System.out.println("Y = "+y);

	  js.executeScript("arguments[0].scrollIntoView()",linuxXpath);
	  
	 // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  }
  
  @Test(enabled = false)
  public void horizontalScrollMethod() 
  {
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	  WebElement vbXpath = driver.findElement(By.xpath("//i[@class=\"icon-code-fork\"]"));
	  
	  js.executeScript("arguments[0].scrollIntoView()",vbXpath);
	
	
  }
  @BeforeTest
  public void beforeTest() 
  {
	  driver = utilobj.browserLaunch(url, "chrome");
  }
  

  @AfterTest
  public void afterTest()
  {
  }

}
