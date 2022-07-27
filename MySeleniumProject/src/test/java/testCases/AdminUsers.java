package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants.Constants;
import elementRepository.AdminUsersElements;
import elementRepository.LoginElements;
import utilityRepository.ExcelRead;

public class AdminUsers extends BaseClass
{

	LoginElements loginObj;
	ExcelRead excelObj;
	AdminUsersElements adminObj;
  @Test(priority=1)
  public void validateAddNewPageOption() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();
	  adminObj = new AdminUsersElements(driver);
	  loginObj.loginMethod(Constants.username,Constants.password);
	  
	  adminObj.clickAdminUser();
	  adminObj.clicknewButton();
	  adminObj.typeNewAdminUserName(excelObj.readingStringData(2, 5));
	  adminObj.typeNewAdminPassword(excelObj.readingStringData(3, 5));
	  adminObj.selectUserType(Constants.visibleTextDropdownAdmin);
	  
	  adminObj.clickSaveButton();
	  adminObj.clickAddAlert();
	     
	  
  }
  
  @Test(priority=2)
  public void validateDeletePageOption() throws Exception 
  {
	
	  adminObj = new AdminUsersElements(driver);
	  adminObj.clickDelete();
	  utilobj.alertAccept();
	  adminObj.clickDeleteAlert();
	     
	  
  }
  
  
}
