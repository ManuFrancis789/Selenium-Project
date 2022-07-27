package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class xpathwebElementsExampleToolsQA
{
	String url = "https://demoqa.com/automation-practice-form";
	WebDriver driver;
  @Test(enabled = true,description="Web Elements")
  public void test1() 
  {
	  WebElement t1 = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
	  t1.sendKeys("Manu");
	 
	  WebElement t2 = driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
	  t2.sendKeys("Francis");
	  
	  WebElement t3 = driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
	  t3.sendKeys("manufrancis@gmail.com");
	  
	  WebElement t4 = driver.findElement(By.xpath("//input[@id=\"userNumber\"]"));
	  t4.sendKeys("9876543210");
	  
	  WebElement t5 = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
	  t5.sendKeys("maths");
	  
	  WebElement t6 = driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));
	  t6.sendKeys("MANU BHAVAN\n NANTHIRICKAL\n KOLLAM\n 691511");
	  
	  WebElement t7 = driver.findElement(By.xpath("//label[text()='Sports']"));
	  t7.click();
	  
	  WebElement t8 = driver.findElement(By.xpath("//label[text()='Reading']"));
	  t8.click();
	  
	  WebElement t9 = driver.findElement(By.xpath("//label[text()='Music']"));
	  t9.click();
	  
	  WebElement t10 = driver.findElement(By.xpath("//label[text()='Male']"));
	  System.out.println(t10.isDisplayed());
	  System.out.println(t10.isEnabled());
	  System.out.println(t10.isSelected());
	 
	  t10.click();
	  
	  System.out.println(t10.isDisplayed());
	  System.out.println(t10.isEnabled());
	  System.out.println(t10.isSelected());
	  
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
	//  driver.close();
  }

}
