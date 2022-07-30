package TestNG_sessions;

import org.testng.annotations.Test;

import UtilityRepository.UtilityRepositoryClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
  @Test() 
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
	 
	 driver.findElement(By.xpath("(//a[@class='small-box-footer'])[8]")).click();
	 
	// WebElement search = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
	 WebElement newBtn = driver.findElement(By.xpath("//a[@onclick='click_button(1)']"));
	 newBtn.click();
	 
	 WebElement nameTextBox = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	 WebElement  emailTextBox = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
	 WebElement  phoneNumberTextBox = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
	 WebElement  addressTextBox = driver.findElement(By.xpath("//textarea[@id='address']"));
	 WebElement  usernameTextBox = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
	 WebElement passwordTextBox = driver.findElement(By.xpath("(//input[@class='form-control'])[5]"));
	 WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
	 
	 nameTextBox.sendKeys("qwerty");
	 emailTextBox.sendKeys("qwert@gmail.com");
	 phoneNumberTextBox.sendKeys("1234567890");
	 addressTextBox.sendKeys("qwerty\n qwerty bhavan"+Keys.ENTER+"qwertaaaaa");
	 
	 usernameTextBox.sendKeys("qwerzzzz");
	 passwordTextBox.sendKeys("asdzx");
	 
	 save.sendKeys(Keys.ENTER);
	 
	 WebElement alert = driver.findElement(By.xpath("//button[@class='close']"));
	 alert.click();
	 WebElement search = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
	 search.click();

      WebElement searchName = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
      WebElement searchEmail = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
      WebElement searchPhoneNumber = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
      WebElement submitBtn = driver.findElement(By.xpath("//button[@class='btn btn-block-sm btn-danger']"));
      
      
      searchName.sendKeys("qwerty");
      submitBtn.click();
      WebElement resetbtn = driver.findElement(By.xpath("//a[@class='btn btn-default btn-fix']"));
      resetbtn.click();
      
      WebElement delete = driver.findElement(By.xpath("(//a[@class='btn btn-sm btn btn-danger btncss'])[1]"));
      delete.click();
      utilobj.alertAccept();
      
      WebElement alert1 = driver.findElement(By.xpath("//button[@class='close']"));
 	 alert1.click();
      
      
  }
  
  @Test(dataProvider = "login",enabled =false)
  public void test2(String user, String pass) 
  {
	  WebElement userName = driver.findElement(By.xpath("//input[@name='username']")); 
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  WebElement signin = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	  userName.sendKeys(user);
	  password.sendKeys(pass);
	 
	  //userName.clear();
	 // password.clear();
	  //signin.click();
		  }
  
  @DataProvider(name ="login")
  public Object[][] dp1() 
  {
    return new Object[][] 
    		{
      new Object[] { "manu", "admin123" },
      new Object[] { "siddarth", "yyyyy" },
      new Object[] { "sneha", "admin123" },
    };
  }
  
  @Test(dataProvider = "manage pages",enabled=false)
  public void test3(String t, String d,String n ) 
  {
	  WebElement userName = driver.findElement(By.xpath("//input[@name='username']")); 
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  WebElement signin = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	  userName.sendKeys("admin");
	  password.sendKeys("admin");
	 
	  //userName.clear();
	 // password.clear();
	  
	  signin.click();
	  driver.findElement(By.xpath("//a[@class='small-box-footer']")).click();
	  WebElement newBtn=driver.findElement(By.xpath("//a[@onclick='click_button(1)']"));
	  newBtn.click();
	  WebElement title = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	  WebElement name = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
	  WebElement des = driver.findElement(By.xpath("//div[@class='note-editable card-block']"));
	  WebElement choose = driver.findElement(By.xpath("//input[@name='main_img']"));
	  title.sendKeys(t);
	  des.sendKeys(d);
	  name.sendKeys(n);
	  choose.sendKeys("C:\\Users\\91859\\Downloads\\photo.jfif");
	  WebElement save = driver.findElement(By.xpath("//button[@name='create']"));
	  save.sendKeys(Keys.ENTER);
	  driver.navigate().back();
	  WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
	  utilobj.scrollMethod(alert);
	  System.out.println(alert.getText());
	  driver.navigate().refresh();
	  driver.navigate().back();
	  WebElement create = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]"));
	  System.out.println(create.getText());
	  driver.findElement(By.xpath("//a[@class='btn btn-sm btn btn-danger btncss'][1]")).click();
	  utilobj.alertAccept();
	  
	  
	  //driver.findElement(By.xpath("//a[text()='Home']")).click();
	  
		  }
  
  @DataProvider(name ="manage pages")
  public Object[][] dp() 
  {
    return new Object[][]
    		{
      new Object[] { "manu", "admin123","1234" },
     
    };
  }
  
  @Test(enabled = false) 
  public void test3()
  {
	  WebElement userName = driver.findElement(By.xpath("//input[@name='username']")); 
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  WebElement signin = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	  //WebElement dismiss = driver.findElement(By.xpath("//button[@data-dismiss='alert']"));
	 // System.out.println(password.isDisplayed());
	  userName.sendKeys("admin");
	 password.sendKeys("admin");
	 signin.click();
	 
	
	 //driver.findElement(By.xpath("(//p[//p[text()='Expense Category']")).click();
	 //WebElement x = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
	//x.click();
	 driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
	 driver.findElement(By.xpath("//p[text()='Expense Category']")).click();
	 
	 WebElement update = driver.findElement(By.xpath("(//a[@class='btn btn-sm btn btn-primary btncss'])[1]"));
	 update.click();
	 WebElement updateTextBox= driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
	 updateTextBox.clear();
	 updateTextBox.sendKeys("qwerty");
	 
	 WebElement updateButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	 updateButton.click();
	 
	 WebElement getTitle = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td"));
	 System.out.println(getTitle.getText());
	 
	 WebElement alert = driver.findElement(By.xpath("//button[@class='close']"));
	 alert.click();
	 
	 WebElement delete = driver.findElement(By.xpath("(//a[@class='btn btn-sm btn btn-danger btncss'])[1]"));
	 delete.click();
	 utilobj.alertAccept();
	 WebElement alert1 = driver.findElement(By.xpath("//button[@class='close']"));
	 alert1.click();
	 
	 WebElement getTitle1 = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td"));
	 System.out.println(getTitle1.getText());	 
	
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
