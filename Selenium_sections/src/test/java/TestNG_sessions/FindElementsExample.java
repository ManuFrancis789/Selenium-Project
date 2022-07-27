package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FindElementsExample 
{
	WebDriver driver;
	String url ="https://www.techlistic.com/p/demo-selenium-practice.html";
  @Test
  public void test1() 
  {
	  
	  WebElement xpathFindElementExample = driver.findElement(By.xpath("//td[contains(@style,'border')]"));
	  String text = xpathFindElementExample.getText();
	  System.out.println(text);
	  
	  List <WebElement> elements = driver.findElements(By.xpath("//td[contains(@style,'border')]"));
	  
	  int size = elements.size() ;
	  System.out.println("size = " +size);
	  
	  for(int i=0;i<size;i++)
	  {
		System.out.println("elements " + elements.get(i).getText()); 
		
	  }
	  
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
