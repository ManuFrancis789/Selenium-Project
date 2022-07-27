package TestClass;

import org.testng.annotations.Test;

import Pages.GroceryRegister;
import UtilityRepository.ExcelRead;
import UtilityRepositorysample.ExcelReadGroceryRegister;
import UtilityRepositorysample.UtilRepoSampleClass;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

public class POMassignmentRegister 
{
	WebDriver driver;
	String url ="http://www.opesmount.in/grocerystore1/";
	UtilRepoSampleClass utilobj = new UtilRepoSampleClass ();
	GroceryRegister obj;
	ExcelReadGroceryRegister  excelobj;
	
  @Test(priority=1,enabled =false)
  public void screenShotHome(ITestResult result) throws Exception 
  {
	  String resultName = result.getName();
	  
	utilobj.screenshotMethod(resultName);
  }
  @Test(priority=2)
  public void validateRegister() throws Exception 
  {
	  obj = new GroceryRegister(driver);
	  excelobj = new ExcelReadGroceryRegister ();
	  obj.clickRegister();
	  utilobj.alertAccept();
	  utilobj.alertAccept();

	//obj.typeFirstName("manu");
	 obj.typeFirstName(excelobj.readingStringData(1, 0));
	 obj.typeLastName(excelobj.readingStringData(2, 0));
	//obj.typeEmail("xxxx@gmail.com");
	 obj.typeEmail(excelobj.readingStringData(3, 0));
	// obj.typeTelephone("1234567890");
	 
	obj.typeTelephone(excelobj.readingIntegerData(4, 0));
		//obj.typeFax("faxName");
	 obj.typeFax(excelobj.readingStringData(5, 0));
	//obj.typeAddress1("MANU BHAVAN");
	 //obj.typeCompany(excelobj.readingStringData(12, 0));
	 obj.typeAddress1(excelobj.readingStringData(6, 0));
	//obj.typeAddress2("Kollam");
	 obj.typeAddress2(excelobj.readingStringData(7, 0));
	//obj.typeCity("Kundara");
	 obj.typeCity(excelobj.readingStringData(8, 0));
	//obj.typePostcode("691511");
	 obj.typePostcode(excelobj.readingIntegerData(9, 0));
	//obj.typePassword("qwerty");
	 obj.typePassword(excelobj.readingStringData(10, 0));
	//obj.typeCofirmPassword("qwerty");
	
	 obj.typeCofirmPassword(excelobj.readingStringData(11, 0));
	 obj.typeCompany(excelobj.readingStringData(12, 0));
	obj.selectCountry();
	utilobj.alertAccept();
	//utilobj.screenshotMethod();
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	driver = utilobj.launchBrowserMethod(url, "chrome");  
  }

  @AfterTest
  public void afterTest() 
  {
  }

}
