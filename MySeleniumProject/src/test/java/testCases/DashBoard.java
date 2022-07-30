package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

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
  @Test(priority=1)
  public void validateUpdateExpenseCategory() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();
	  dashObj = new DashBoardElements(driver);
	  loginObj.loginMethod(Constants.username,Constants.password);
	  
	  dashObj.clickManageExpenseTab();
	  dashObj.clickexpenseCategoryTab();
	  dashObj.clickUpdate();
	  dashObj.clearTextBox();
	  dashObj.enterDataInUpdateTextBox(Constants.updateExpenseCategory);
	  dashObj.clickSave();
	  String actual = dashObj.getTitleString();
	  String expected = Constants.updateExpenseCategory;
	  dashObj.clickAlert();
	  
	  Assert.assertEquals(actual, expected);
	 
  }
  @Test(priority=2)
  public void validateDeleteExpenseCategory() throws Exception 
  {	
	  dashObj = new DashBoardElements(driver);
	  dashObj.clickDelete();
	  utilobj.alertAccept();
	  String actual = dashObj.getTitleString();
	  String expected = Constants.updateExpenseCategory;
	  dashObj.clickAlert();
	  
	  Assert.assertNotEquals(actual, expected);
	 
  }
  
}
