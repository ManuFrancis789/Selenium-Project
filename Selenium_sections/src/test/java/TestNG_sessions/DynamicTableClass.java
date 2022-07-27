package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class DynamicTableClass 
{
	WebDriver driver;
	String url = "https://www.w3schools.com/html/html_tables.asp";
	String browser="chrome";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass();
	//table[@id='customers']/tbody/tr[3]/td[2]
	
  @Test
  public void dynamicTableMethod() 
  {
	  List <WebElement> row1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	  int rowCount = row1.size();
	  
	  
	  List<WebElement> coloumn1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
	  int coloumnCount = coloumn1.size();
	  System.out.println("Row Size" +rowCount +"Coloumn Size" +coloumnCount);
	  
	  for(int i = 2;i<=rowCount;i++)
	  {
		  for(int j =1;j<=coloumnCount;j++)
		  {
			  if ((j==2)||(j==3))
			  {
			  
			  String webData = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
			  System.out.println(webData);
			  }
		  }
		  System.out.println(" ");
	  }
  }
  @BeforeTest
  public void beforeTest() 
  {
	 driver = utilobj.browserLaunch(url, browser);
  }

  @AfterTest
  public void afterTest() 
  {
	  //driver.close();
  }

}
