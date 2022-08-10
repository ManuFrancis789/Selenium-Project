package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import constants.Constants;
import elementRepository.AdminUsersElements;
import elementRepository.DashBoardElements;
import elementRepository.LoginElements;
import utilityRepository.ExcelRead;

public class DashBoard extends BaseClass
{
	LoginElements loginObj;
	ExcelRead excelObj;
	DashBoardElements dashObj;
	SoftAssert softassert;
	
	@Test(priority=1,groups= {"regression"})
	  public void validateAddExpenseCategory() throws Exception 
	  {
		  loginObj = new LoginElements(driver);
		  excelObj = new ExcelRead();
		  softassert = new SoftAssert();
		  dashObj = new DashBoardElements(driver);
		  loginObj.loginMethod(Constants.username,Constants.password);
		  
		  dashObj.clickManageExpenseTab();
		  dashObj.clickexpenseCategoryTab();
		  dashObj.clickNewBtn();
		  dashObj.enterDataInUpdateTextBox(Constants.newExpenseCategory);
		  
		  dashObj.clickSaveNew();
		  
		  String excpected = Constants.newExpenseCategory;
		  String actual = dashObj.getNewExpenseCategory();
		  
		  dashObj.clickAlert();
		  
		  softassert.assertEquals(actual, excpected);
		  softassert.assertAll();
		 
	  }
  @Test(priority=2,groups= {"regression"})
  public void validateUpdateExpenseCategory() throws Exception 
  {
	  softassert = new SoftAssert();
	 
	  dashObj.clickUpdate();
	  dashObj.clearTextBox();
	  dashObj.enterDataInUpdateTextBox(Constants.updateExpenseCategory);
	  dashObj.clickSave();
	  String actual = dashObj.getTitleString();
	  String expected = Constants.updateExpenseCategory;
	  dashObj.clickAlert();
	  
	  softassert.assertEquals(actual, expected);
	  softassert.assertAll();
	 
  }
  @Test(priority=3,groups= {"regression"})
  public void validateDeleteExpenseCategory() throws Exception 
  {	
	  softassert = new SoftAssert();
	  dashObj = new DashBoardElements(driver);
	  dashObj.clickDelete();
	  utilobj.alertAccept();
	  String actual = dashObj.getTitleString();
	  String expected = Constants.updateExpenseCategory;
	  dashObj.clickAlert();
	  
	  softassert.assertNotEquals(actual, expected);
	  softassert.assertAll();
	 
  }
  
}
