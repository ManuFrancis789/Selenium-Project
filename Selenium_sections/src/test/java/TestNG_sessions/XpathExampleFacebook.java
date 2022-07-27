package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class XpathExampleFacebook 
{
	WebDriver driver;
  @Test
  public void elementFinder()
  {
	  driver.get("https://www.facebook.com/");
	  WebElement xpathFacebookEmail = driver.findElement(By.xpath("//input[@type = 'text']"));
	  xpathFacebookEmail.sendKeys("a");
	  
	
	  WebElement xpathFacebookPassword = driver.findElement(By.xpath("//input[@type = 'password']"));
	  xpathFacebookPassword.sendKeys("b");
	  
	  WebElement xpathFacebookLogin = driver.findElement(By.xpath("//button[@type = 'submit']"));
	  xpathFacebookLogin.click();
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
