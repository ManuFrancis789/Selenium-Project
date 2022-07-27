package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropDownAssignment 
{
	WebDriver driver;
	String url = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
  @Test
  public void dropDownMethod() 
  {
	 WebElement xpathDropDown = driver.findElement(By.xpath("//select"));
	 Select selectobj = new Select(xpathDropDown);
	 selectobj.selectByValue("AUS");
	 System.out.println("Select option is  " +selectobj.getFirstSelectedOption().getText());
	/* List <WebElement> elements = driver.findElements(By.xpath("//select"));
	 int size = elements.size();
	 System.out.println("size =" +size);
	 System.out.println("elements are");
	 for(int i = 0;i<size;i++)
	 {
		 System.out.println("Element  " +i +":" +elements.get(i).getText());
	 }*/
	 List<WebElement> elements = selectobj.getOptions();
	 int size = elements.size();
	 System.out.println("size =" +size);
	 System.out.println("elements are");
	 for(int i = 0;i<size;i++)
	 {
		 System.out.println("Element  " +i +":" +elements.get(i).getText());
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
