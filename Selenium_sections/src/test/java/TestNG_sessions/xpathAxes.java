package TestNG_sessions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class xpathAxes 
{
	WebDriver driver;
  @Test(enabled = false,description="following")
  public void test1() 
  {
	 WebElement xpathAxesAssignLeave = driver.findElement(By.xpath("//div[@class='quickLaunge'] //following::img"));
	 xpathAxesAssignLeave.click();
	 
	 
	  
	  ////  //span[contains(text(),'Assign Leave')] //ancestor::table   // for ancestor tags(grnd parent,parent etc)
	 ////  //span[contains(text(),'Assign Leave')] //preceding::a
	 ////  //span[contains(text(),'Assign Leave')] //preceding::a[9]
	 //////a[contains(@target,'self')]//child::span
	 ////////span[@class='quickLinkText']//parent::a
	 ///// //span[@class='quickLinkText']//self::span
	 ////  //a[@target='_self']//descendant::img
	 //driver.findElement(By.xpath("//img [contains(@src,'ApplyLeave')] //following-sibling::span")).click();
  }
  
  @Test(enabled = false,description="sibling")
  public void test2()
  {
	  driver.findElement(By.xpath("//img [contains(@src,'ApplyLeave')] //following-sibling::span")).click();
	  ///like this also we can write without saving element to a variable
  }
  @Test(enabled = false,description="ancestor")
  public void test3()
  {
	  WebElement xpathAxesAncestor = driver.findElement(By.xpath("//img[contains(@src,\"MyTimesheet\")]//ancestor::td"));
	  xpathAxesAncestor.click();
  }
  
  @Test(enabled = false,description="preceding")
  public void test4()
  {
	  WebElement xpathAxesPreceding = driver.findElement(By.xpath("//b[text()=\"Dashboard\"]//preceding::b[6]"));
	  xpathAxesPreceding.click();
  }
  @Test(enabled = false,description="parent")
  public void test5()
  {
	  WebElement xpathAxesParent = driver.findElement(By.xpath("//span[text()=\"My Leave\"]//parent::a"));
	  xpathAxesParent.click();
  }
  @Test(enabled = false,description="child")
  public void test6()
  {
	  WebElement xpathAxesChild = driver.findElement(By.xpath("//a[contains(@href,'MyLeave')]//child::span"));
	  xpathAxesChild.click();
  }
  
  @Test(enabled = false,description="descedent")
  public void test7()
  {
	  WebElement xpathAxesDescedent = driver.findElement(By.xpath("//a[@target='_self']//descendant::img"));
	  xpathAxesDescedent.click();
  }
  @Test(enabled = true,description="self")
  public void test8()
  {
	  WebElement xpathAxesSelf = driver.findElement(By.xpath("//span[@class='quickLinkText']//self::span"));
	  xpathAxesSelf.click();
  }
  
  @BeforeTest
  public void beforeTest()
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
	  username.sendKeys("Admin");
	  
	  WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	  password.sendKeys("admin123");
	  
	  WebElement login = driver.findElement(By.xpath("//input[@value='LOGIN']"));
	  login.click();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
