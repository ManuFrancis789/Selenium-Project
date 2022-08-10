package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import elementRepository.LoginElements;
import utilityRepository.ExcelRead;

public class Login extends BaseClass
{
	LoginElements loginObj;
	ExcelRead excelObj;
	
	
  @Test(priority=6,groups= {"regression","sanity"})
  public void validateLoginWithInvalidUserName() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();

	  loginObj.typeUserName(excelObj.readingStringData(1, 0));
	  loginObj.typePassword(excelObj.readingStringData(2, 1));
	  loginObj.clickMethod();
	  String excpected = Constants.excpectedLoginDismiss;
	  String actual = loginObj.getTextDismissbtn();
	  
	  loginObj.clickDismissBtn();
	  utilobj.back();
	  utilobj.refreshPage();
	  
	  Assert.assertEquals(actual, excpected);
  }
  
  @Test(priority=7,groups= {"regression","sanity"})
  public void validateLoginWithInvalidPassword() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();

	  loginObj.typeUserName(excelObj.readingStringData(2, 0));
	  loginObj.typePassword(excelObj.readingStringData(1, 1));
	  loginObj.clickMethod();
	  String excpected = Constants.excpectedLoginDismiss;
	  String actual = loginObj.getTextDismissbtn();
	  	  
	  utilobj.back();
	  utilobj.refreshPage();
	  
	  Assert.assertEquals(actual, excpected);
  }
  
  @Test(priority=1,groups= {"regression","sanity"})
  public void validateLoginWithPasswordAlone() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();
	  
	  loginObj.typePassword(excelObj.readingStringData(2, 1));
	  loginObj.clickMethod();
	  
	  boolean actual = loginObj.isPassswordDisplayed();
	  utilobj.refreshPage();
	  
	  Assert.assertTrue(actual);
	 
  }
  
  @Test(priority=2,groups= {"regression","sanity"})
  public void validateLoginWithUserNameAlone() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();

	  loginObj.typeUserName(excelObj.readingStringData(2, 0));
	  loginObj.clickMethod();
	  
	  boolean actual = loginObj.isPassswordDisplayed();
	  utilobj.refreshPage();
	  
	  Assert.assertTrue(actual);
	  	 
	    }
  
  @Test(priority=3,groups= {"regression","sanity"})
  public void validateLoginWithCorrectUserNameAndPassword() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();

	  loginObj.typeUserName(excelObj.readingStringData(2, 0));
	  loginObj.typePassword(excelObj.readingStringData(2, 1));
	  loginObj.clickMethod();
	  
	  
	  boolean actual = loginObj.isManagePagesDisplayed();
	  utilobj.back();
	  utilobj.refreshPage();
	  
	  Assert.assertTrue(actual);
	 
	 }
  
  @Test(priority=4,groups= {"regression"})
  public void validateRememberMebuttonBeforeClick()
  {
	  boolean rememberMe = loginObj.isRememberMeSelected();
	  utilobj.refreshPage();
	  Assert.assertFalse(rememberMe);
	 
  }
  
  @Test(priority=5,groups= {"regression"})
  public void validateRememberMebuttonAfterClick()
  {
	  loginObj.rememberMeClick();
	  boolean rememberMe = loginObj.isRememberMeSelected();
	  utilobj.refreshPage();
	  Assert.assertTrue(rememberMe);
	 
  }
  
}
