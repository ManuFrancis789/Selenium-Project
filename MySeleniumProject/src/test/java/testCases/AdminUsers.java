package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import constants.Constants;
import elementRepository.AdminUsersElements;
import elementRepository.LoginElements;
import utilityRepository.ExcelRead;

public class AdminUsers extends BaseClass
{

	LoginElements loginObj;
	ExcelRead excelObj;
	AdminUsersElements adminObj;
	SoftAssert softassert;
  @Test(priority=1,groups= {"regression"})
  public void validateAddNewPageOption() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();
	  adminObj = new AdminUsersElements(driver);
	  softassert = new SoftAssert();
	  loginObj.loginMethod(Constants.username,Constants.password);
	  
	  adminObj.clickAdminUser();
	  adminObj.clicknewButton();
	  adminObj.typeNewAdminUserName(excelObj.readingStringData(2, 5));
	  adminObj.typeNewAdminPassword(excelObj.readingStringData(3, 5));
	  adminObj.selectUserType(Constants.visibleTextDropdownAdmin);
	  
	  adminObj.clickSaveButton();
	  String actual = adminObj.getAlertText();
	  String excpected = Constants.expectedClickAlert;
	  adminObj.clickAlert();
	  
	  softassert.assertEquals(actual, excpected);
	  softassert.assertAll();
	     
	  
  }
  
  @Test(priority=2,groups= {"regression"})
  public void validateDeletePageOption() throws Exception 
  {
	
	  adminObj = new AdminUsersElements(driver);
	  softassert = new SoftAssert();
	  adminObj.clickDelete();
	  utilobj.alertAccept();
	  String actual = adminObj.getAlertText();
	  String excpected = Constants.expectedClickAlert;
	  adminObj.clickDeleteAlert();
	   
	  softassert.assertEquals(actual, excpected);
	  softassert.assertAll();
	  
  }
  @Test(priority=3,groups= {"regression"})
  public void validateLockPageButtonIsClickable() throws Exception 
  {
		  adminObj = new AdminUsersElements(driver);  
		  adminObj.clickLockButton();
		  String actual = adminObj.getAlertText();
		  String expected = Constants.expectedClickAlert;
		  adminObj.clickAlert();
		  Assert.assertEquals(actual, expected);
  }
  @Test(priority=4,groups= {"regression"})
  public void validateUnLockPageButtonIsClickable() throws Exception 
  {
	
	  adminObj = new AdminUsersElements(driver);
	  adminObj.clickUnLockButton();
	  String actual = adminObj.getAlertText();
	  String expected = Constants.expectedClickAlert;
	  adminObj.clickAlert();
	  Assert.assertEquals(actual, expected);
  }

  @Test(priority=5,groups= {"regression"})
  public void validateActiveButtonIsClickable() throws Exception 
  {
	
	  adminObj = new AdminUsersElements(driver);
	  adminObj.clickActiveButton();
	  String actual = adminObj.getAlertText();
	  String expected = Constants.expectedClickAlert;
	  adminObj.clickAlert();
	  Assert.assertEquals(actual, expected);
  }
  @Test(priority=6,groups= {"regression"})
  public void validateInActiveButtonIsClickable()  
  {
	
	  adminObj = new AdminUsersElements(driver);
	  adminObj.clickInactiveButton();
	  String actual = adminObj.getAlertText();
	  String expected = Constants.expectedClickAlert;
	  adminObj.clickAlert();
	  Assert.assertEquals(actual, expected);
  }
  @Test(priority=7,groups= {"regression"})
  public void validateUpdateButton() throws Exception 
  {
	
	  adminObj = new AdminUsersElements(driver);
	  excelObj = new ExcelRead();
	  
	  adminObj.clickUpdateBtn();
	  adminObj.typeUpdateUsername(excelObj.readingStringData(2, 5));
	  adminObj.typeUpdatePassword(excelObj.readingStringData(3, 5));
	  adminObj.selectUpdateUserType(Constants.visibleTextDropdownAdmin);
	  adminObj.clickSaveButton();
	  
	  String actual = adminObj.getAlertText();
	  String excpected = Constants.expectedClickAlert;
	  adminObj.clickAlert();
	  adminObj.clickDelete();
	  utilobj.alertAccept();
	  adminObj.clickAlert();
	  
	  Assert.assertEquals(actual, excpected);
	 
  }
}
