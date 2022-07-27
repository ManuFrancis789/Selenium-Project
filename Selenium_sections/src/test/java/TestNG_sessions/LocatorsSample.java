package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LocatorsSample 
{
	WebDriver driver;
  @Test
  public void idOpen()
  {
	  
	  driver.get("https://www.python.org\n");
	  
	  				//*****by id*****//
	  
	//WebElement Search =   driver.findElement(By.id("id-search-field"));
	//Search.click();
	  
	  				//*****by classname*****//
	  
	//WebElement donateButton = driver.findElement(By.className("donate-button"));
	//donateButton.click();
	
	  				//******by name******//
	  
	//WebElement goButton = driver.findElement(By.name("submit"));
	//goButton.click();
	
	  				//*****by tag name*****//
	  
	//WebElement goTagbutton = driver.findElement(By.tagName("button"));
	//goTagbutton.click();
	
	  				//*****by link test*****//
	  
	//WebElement learnMore = driver.findElement(By.linkText("Learn More"));
	//learnMore.click();
	
	  				//*****by partial link test*****//
	  
	//WebElement partialLearnmore = driver.findElement(By.partialLinkText("Learn"));
	//partialLearnmore.click();
	  
	  							/////*****css locator*****/////
	  				//*****by id*****//
					//css = input#id-search-field;
	  
	//WebElement cssSearch = driver.findElement(By.cssSelector("input#id-search-field"));
	//cssSearch.click();
	  
	  				//*****by attributes*****//
	  				//css= button[name=submit]
	
	//WebElement cssSearchattribute = driver.findElement(By.cssSelector("button[name=submit]"));
    //cssSearchattribute.click();
	  
	  				//*****by tag class attributes*****//
  
	// WebElement cssSearchTagClassAttribute = driver.findElement(By.cssSelector("button.search-button[name=submit]"));
   // cssSearchTagClassAttribute.click();
	  
	  				//*****by class*****//
  
	//WebElement cssGoClass = driver.findElement(By.cssSelector("button.search-button"));  
	//cssGoClass.click();
	  
	  				//*****by innertext*****//
	  
  WebElement cssInnerText = driver.findElement(By.cssSelector("a:contains(About)"));
  cssInnerText.click();
  
  }
  @BeforeTest
  public void beforeTest() 
  
  {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
