package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Project
{
	WebDriver driver;
	String url="https://groceryapp.uniqassosiates.com/admin";
	String browser="chrome";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass();
  @Test
  public void test() 
  {
	  WebElement userName = driver.findElement(By.xpath("//input[@name='username']")); 
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  WebElement signin = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	  //WebElement dismiss = driver.findElement(By.xpath("//button[@data-dismiss='alert']"));
	 // System.out.println(password.isDisplayed());
	  userName.sendKeys("admin");
	 password.sendKeys("admin");
	 signin.click();
	 
	 WebElement adminElement = driver.findElement(By.xpath("(//a[@class='small-box-footer'] )[2]"));
	 adminElement.click();
	 WebElement newElement = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	 newElement.click();
	 WebElement userElement = driver.findElement(By.xpath("//input[@name='username']"));
	 userElement.sendKeys("Akhil");
	 WebElement passElement = driver.findElement(By.xpath("//input[@name='password']"));
	 passElement.sendKeys("hhhjj");
	 WebElement userdropElement = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
	
	 Select selectobj = new Select(userdropElement);
		selectobj.selectByVisibleText("Admin");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		WebElement deleteAddAlert = driver.findElement(By.xpath("//button[@class='close']"));
		deleteAddAlert.click();
		
		WebElement delete = driver.findElement(By.xpath("(//a[@class='btn btn-sm btn btn-danger btncss'])[1]"));
		delete.click();
		
		utilobj.alertAccept();
		WebElement deleteAlert = driver.findElement(By.xpath("//button[@class='close']"));
		deleteAlert.click();
	  /*WebElement element = driver.findElement(By.xpath("(//a[@class='small-box-footer'] )[1]"));
	  //System.out.println(element.isDisplayed());
	  element.click();
	  //new pages in manage pages
	 // WebElement flower = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td"));
	  //System.out.println(flower.getText());
	  //List <WebElement> row1 = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr"));
	 // int rowCount = row1.size();
	 // System.out.println(rowCount);
	  
	  
	  WebElement element2 = driver.findElement(By.xpath("//a[@onclick='click_button(1)']"));
	  element2.click();
	  
	  WebElement element4 = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	  element4.sendKeys("flowersssss");
	  System.out.println(element4.getAttribute("value"));
	  driver.findElement(By.xpath("//div[@class='note-editable card-block']")).sendKeys("kakakakka");
	  driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("ohhhhhhhh");
	 //boolean x = element.isSelected();
	  
	
	//e.click();
	 Actions actionobj = new Actions(driver);
	 WebElement e =driver.findElement(By.xpath("//input[@name='main_img']"));
	 //actionobj.moveToElement(e).click().build().perform();
	 e.sendKeys("C:\\Users\\91859\\Downloads\\sampleFile.jpeg");
	 System.out.println(e.getAttribute("value"));
	 System.out.println(e.getAttribute("value").isEmpty());
	
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement save = driver.findElement(By.xpath("//button[@name='create']"));
	  js.executeScript("arguments[0].scrollIntoView()",save);
	System.out.println(save.isDisplayed());
	System.out.println(save.getAttribute("class"));*/
	//save.click();
	//actionobj.scrollToElement(save).click().build().perform();
	//actionobj.moveToElement(save).click().build().perform();
	
	//driver.navigate().back();
	/*WebElement delete = driver.findElement(By.xpath("(//a[@class='btn btn-sm btn btn-danger btncss'])[1]"));
    
	delete.click();
	utilobj.alertAccept();
	
	String a =driver.findElement(By.xpath("//button[@class='close']")).getText();
	System.out.println(a);
	driver.findElement(By.xpath("//button[@class='close']")).click();*/
	
	////Page No
	/*WebElement PageNoTwo =driver.findElement(By.xpath("(//a[@class='page-link'])[2]"));
	System.out.println(PageNoTwo.getText());
	System.out.println(PageNoTwo.getLocation());
	js.executeScript("window.scrollBy(1117,1322)");
	
	WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	actionobj.moveToElement(PageNoTwo).click().build().perform();
	//explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@class='page-link'])[2]"))).click();
	//PageNoTwo.click();*/
  }
  @BeforeTest
  public void beforeTest() 
  {
	 driver =  utilobj.browserLaunch(url, browser);
  }

  @AfterTest
  public void afterTest() {
  }

}
