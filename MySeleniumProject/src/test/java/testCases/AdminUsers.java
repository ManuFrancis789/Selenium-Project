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
  @Test
  public void validateNewOption() throws Exception 
  {
	 loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();
	  adminObj = new AdminUsersElements(driver);
	  loginObj.loginMethod(Constants.username,Constants.password);
	  
	  adminObj.clickAdminUser();
	  
  }
}
