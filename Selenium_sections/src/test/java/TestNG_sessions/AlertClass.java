package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AlertClass 

{
	WebDriver driver;
	//String url ="http://demo.automationtesting.in/Alerts.html";  //for simple alert and confirmation alert
	String url ="https://demoqa.com/alerts";
	UtilityRepositoryClass utilobj = new UtilityRepositoryClass ();
	By xpathSimpleAlert = By.xpath("//button[@onclick=\"alertbox()\"]");
	By xpathConfirmAlertClick = By.xpath("//a[contains(text(),'Alert with OK & Cancel')]");
	By xpathConfirmAlertDisplay = By.xpath("//button[text()='click the button to display a confirm box ']");
	//By xpathPromptAlertClick = By.xpath("//a[text()=\"Alert with Textbox \"]");
	//By xpathPromptALertDisplay = By.xpath("//button[text()=\"click the button to demonstrate the prompt box \"]");
	By xpathPromptAlert=By.xpath("//button[@id='promtButton']");
	@Test(enabled = false)
  public void simpleAlert() 
  {
	  WebElement simple = driver.findElement(xpathSimpleAlert);
	  simple.click();
	  
	  Alert alerts = driver.switchTo().alert();   /// driver control to alert
	  alerts.accept();
	  
	  
  }
  
  @Test(enabled = false)
  public void confirmationAlert()
  {
	  WebElement confirm = driver.findElement(xpathConfirmAlertClick);
	  WebElement confirmClick = driver.findElement(xpathConfirmAlertDisplay);
	  confirm.click();
	  confirmClick.click();
	  
	  Alert alerts = driver.switchTo().alert();
	  alerts.dismiss();
	    
  }
  
  @Test
  public void promptAlert() 
  {
	  WebElement prompt = driver.findElement(xpathPromptAlert);
	  prompt.click();
	 
	  
	 Alert alerts = driver.switchTo().alert();
	 alerts.sendKeys("manu");
	 System.out.println(alerts.getText());
	 alerts.accept();
	    
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	driver = utilobj.browserLaunch(url,"chrome"); 
  }

  @AfterMethod
  public void afterMethod()
  {
	 // driver.quit();
  }

  @BeforeTest
  public void beforeTest() 
  {
  }

  @AfterTest
  public void afterTest() 
  {
  }

}
