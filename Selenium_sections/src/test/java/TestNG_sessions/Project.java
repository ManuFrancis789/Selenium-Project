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
  @Test(enabled = false) 
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
      
      WebElement update = driver.findElement(By.xpath("(//a[@class='btn btn-sm btn btn-primary btncss'])[2]"));
      update.click();
      WebElement saveUpdate = driver.findElement(By.xpath("//button[@name='update']"));
      saveUpdate.sendKeys(Keys.ENTER);
      //WebElement delete = driver.findElement(By.xpath("(//a[@class='btn btn-sm btn btn-danger btncss'])[1]"));
     // delete.click();
      //utilobj.alertAccept(); 
      
      WebElement alert2 = driver.findElement(By.xpath("//button[@class='close']"));
 	alert2.click();
 	
 	// WebElement search1 = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
	 //search1.click();

     // WebElement searchName1 = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
 	//searchName1.sendKeys("kakakakakakaka");
 	//WebElement submitBtn1 = driver.findElement(By.xpath("//button[@class='btn btn-block-sm btn-danger']"));
 	//submitBtn1.click();
 	//WebElement pageName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td"));
     //System.out.println(pageName.getText()); 
     
     WebElement active = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[6]"));
     //System.out.println(active.getText());
     
     if(active.getText()=="Active")
     {
    	active.click();
    	WebElement alert3 = driver.findElement(By.xpath("//button[@class='close']"));
       	alert3.click();
      
    	String excpected = "Inactive";
    	 WebElement active5 = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[6]"));
    	String actual = active5.getText();
    	Assert.assertEquals(actual,excpected);
    	
     }
     else if(active.getText()=="Inactive")
     {
    	 WebElement active1 = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[6]"));
    	 active1.click();
    	 WebElement alert4 = driver.findElement(By.xpath("//button[@class='close']"));
    	   	alert4.click();
    	
    	 String excpected = "Active";
    	 WebElement active2 = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[6]"));
     	String actual = active2.getText();
     	Assert.assertEquals(actual,excpected);
     		}
     
     
      
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
  
  @Test() 
  public void test3() throws Exception
  {
	  WebElement userName = driver.findElement(By.xpath("//input[@name='username']")); 
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  WebElement signin = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	  //WebElement dismiss = driver.findElement(By.xpath("//button[@data-dismiss='alert']"));
	 // System.out.println(password.isDisplayed());
	  userName.sendKeys("admin");
	 password.sendKeys("admin");
	 signin.click();
	 driver.findElement(By.xpath("(//a[@class='small-box-footer'])[11]")).click();
	 WebElement newBtn =driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	 newBtn.click();
	 WebElement countryDropDown=driver.findElement(By.xpath("(//select[@class='form-control selectpicker'])[1]"));
	 Select selectobj = new Select(countryDropDown);
		selectobj.selectByVisibleText("United Kingdom");
		WebElement stateDropDown=driver.findElement(By.xpath("(//select[@class='form-control selectpicker'])[2]"));	
		Select selectobj2 = new Select(stateDropDown);
		selectobj2.selectByVisibleText("Cambridge");
		WebElement location = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		location.sendKeys("Anfield");
		WebElement delCharge = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
		delCharge.sendKeys("8500");
driver.findElement(By.xpath("//button[@name='create']")).click();
driver.findElement(By.xpath("//i[@class='nav-icon fas fa-map-marker']")).click();

WebElement getLocation = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td"));
System.out.println(getLocation.getText());

WebElement search = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
search.click();


WebElement countryDropDown1=driver.findElement(By.xpath("(//select[@class='form-control selectpicker'])[1]"));
Select selectobj3 = new Select(countryDropDown1);
selectobj3.selectByVisibleText("United Kingdom");


//WebElement stateDropDown1=driver.findElement(By.xpath("(//select[@class='form-control selectpicker'])[2]"));	
//Select selectobj4 = new Select(stateDropDown1);
//selectobj4.selectByVisibleText("Cambridge");

WebElement locationsearch = driver.findElement(By.xpath("//input[@class='form-control']"));
locationsearch.sendKeys("Anfield");

WebElement searchBtn = driver.findElement(By.xpath("//button[@class='btn btn-danger btn-fix align-center']"));

driver.findElement(By.xpath("//i[@class='nav-icon fas fa-map-marker']")).click();
WebElement delete = driver.findElement(By.xpath("(//a[@class='btn btn-sm btn btn-danger btncss'])[1]"));
delete.click();

utilobj.alertAccept();

WebElement active = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[5]/a/span"));
System.out.println(active.getText());





		 
	
  }
  @Test(enabled = false) 
  public void testttt()
  {
	  Actions actionobj = new Actions(driver);
	  WebElement userName = driver.findElement(By.xpath("//input[@name='username']")); 
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  WebElement signin = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	  //WebElement dismiss = driver.findElement(By.xpath("//button[@data-dismiss='alert']"));
	 // System.out.println(password.isDisplayed());
	  userName.sendKeys("admin");
	 password.sendKeys("admin");
	 signin.click();
	 
utilobj.clickMethodUtility(By.xpath("(//a[@class='small-box-footer'])[10]"));
WebElement date = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[6]/a[2]"));
	date.click();
	
	WebElement calendar = driver.findElement(By.xpath("(//input[@type='date'])[3]"));
	calendar.click();
	calendar.sendKeys(Keys.ARROW_DOWN);
	calendar.sendKeys(Keys.ARROW_LEFT);
	calendar.sendKeys(Keys.ARROW_DOWN);
	calendar.sendKeys(Keys.ARROW_LEFT);
	calendar.sendKeys(Keys.ARROW_DOWN);
	
	System.out.println(calendar.getAttribute("value"));
	WebElement timeFrom = driver.findElement(By.xpath("(//input[@id='basicExample'])[1]"));
	timeFrom.click();
	timeFrom.sendKeys(Keys.ARROW_DOWN);
	timeFrom.sendKeys(Keys.ENTER);
	//actionobj.contextClick(calendar).build().perform();
	//actionobj.
	//actionobj.click(calendar).build().perform();
	/*String dateVal = "November 22, 2020";
	JavascriptExecutor  js=(JavascriptExecutor)driver; 
    js.executeScript("arguments[0].click();", 
    		driver.findElement(By.xpath("(//input[@type='date'])[3]")));*/
  
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
