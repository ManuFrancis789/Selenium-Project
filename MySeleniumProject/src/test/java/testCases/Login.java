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
	
  @Test(priority=6)
  public void ValidateLoginWithInvalidUserNameAndPassword() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();

	  loginObj.typeUserName(excelObj.readingStringData(1, 0));
	  loginObj.typePassword(excelObj.readingStringData(1, 1));
	  loginObj.clickMethod();
	  String excpected = Constants.excpectedLoginDismiss;
	  String actual = loginObj.getTextDismissbtn();
	  
	  utilobj.back();
	  utilobj.refreshPage();
	  
	  Assert.assertEquals(actual, excpected);
  }
  @Test(priority=1)
  public void validateLoginWithPasswordAlone() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();
	  
	  loginObj.typePassword(excelObj.readingStringData(2, 1));
	  loginObj.clickMethod();
	  String excpected = Constants.excpectedLoginUrl;
	  String actual = utilobj.getPageUrl();
	  utilobj.refreshPage();
	  
	 Assert.assertNotEquals(actual, excpected);
  }
  
  @Test(priority=2)
  public void validateLoginWithUserNameAlone() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();

	  loginObj.typeUserName(excelObj.readingStringData(2, 0));
	  loginObj.clickMethod();
	  
	  String excpected = Constants.excpectedLoginUrl;
	  String actual = utilobj.getPageUrl();
	  utilobj.refreshPage();
	  
	  Assert.assertNotEquals(actual, excpected);
	 
	    }
  
  @Test(priority=3)
  public void validateLoginWithCorrectUserNameAndPassword() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();

	  loginObj.typeUserName(excelObj.readingStringData(2, 0));
	  loginObj.typePassword(excelObj.readingStringData(2, 1));
	  loginObj.clickMethod();
	  
	  String excpected = Constants.excpectedLoginUrl;
	  String actual = utilobj.getPageUrl();
	  utilobj.back();
	  utilobj.refreshPage();
	  
	  Assert.assertEquals(actual, excpected);
	 
	    }
  
  @Test(priority=4)
  public void validateRememberMebuttonBeforeClick()
  {
	  boolean rememberMe = loginObj.isRememberMeSelected();
	  utilobj.refreshPage();
	  Assert.assertFalse(rememberMe);
	 
  }
  
  @Test(priority=5)
  public void validateRememberMebuttonAfterClick()
  {
	  loginObj.rememberMeClick();
	  boolean rememberMe = loginObj.isRememberMeSelected();
	  utilobj.refreshPage();
	  Assert.assertTrue(rememberMe);
	 
  }
  
}
